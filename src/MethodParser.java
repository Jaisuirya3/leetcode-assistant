import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class MethodParser {

    /**
     * Parses a method definition string, collects user inputs, and dynamically invokes the method.
     *
     * @param methodDefinition The method definition in the format "public int methodName(String param1, int param2)"
     * @param classOfMethod    The class where the method is defined.
     */
    public static void callTheMethod(String methodDefinition, Class<?> classOfMethod) {
        try {
            // Extract method details using regex
//            String regex = "(public|private|protected)\\s+(\\w+)\\s+(\\w+)\\((.*)\\)";
            String regex = "(public|private|protected)\\s+((?:\\w+|List<\\w+>|Set<\\w+>|Map<\\w+,\\w+>))\\s+(\\w+)\\((.*)\\)";
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(regex).matcher(methodDefinition);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid method definition format.");
            }

            String returnType = matcher.group(2); // Extract return type
            String methodName = matcher.group(3); // Extract method name
            String paramString = matcher.group(4); // Extract parameters
            System.out.println(returnType);
            System.out.println(methodName);
            System.out.println(paramString);

            // Process parameter types and names
            String[] paramDetails = paramString.isEmpty() ? new String[0] : paramString.split(",");
            Class<?>[] paramTypes = new Class[paramDetails.length];
            Object[] paramValues = new Object[paramDetails.length];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter values for the parameters:");

            for (int i = 0; i < paramDetails.length; i++) {
                String[] paramTypeAndName = paramDetails[i].trim().split("\\s+");
                if (paramTypeAndName.length != 2) {
                    throw new IllegalArgumentException("Invalid parameter definition: " + paramDetails[i]);
                }

                String paramType = paramTypeAndName[0];
                String paramName = paramTypeAndName[1];

                System.out.println("Leave empty and hit enter to exit");
                System.out.print(paramName + " (" + paramType + "): ");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.exit(0);
                }
                paramValues[i] = parseInput(paramType, input);
                paramTypes[i] = getClassForType(paramType);
            }

            // Find and invoke the method
            Class<?> clazz = classOfMethod;
            Method method = clazz.getDeclaredMethod(methodName, paramTypes);
            Object instance = clazz.getDeclaredConstructor().newInstance();

            Object result = method.invoke(instance, paramValues);

            // Handle return type
            if (!returnType.equals("void")) {
                System.out.println("Output: " + result);
            }
            System.out.println("\n\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Converts user input into the appropriate type.
     */
    private static Object parseInput(String paramType, String input) {
        switch (paramType) {
            case "int":
                return Integer.parseInt(input);
            case "double":
                return Double.parseDouble(input);
            case "float":
                return Float.parseFloat(input);
            case "long":
                return Long.parseLong(input);
            case "String":
                return input;
            case "char":
                return input.charAt(0);
            case "boolean":
                return Boolean.parseBoolean(input);
            case "List<String>":
                return Arrays.asList(input.split(","));
            case "List<Integer>":
                return Arrays.stream(input.split(",")).map(Integer::parseInt);
            case "Set<String>":
                return new HashSet<>(Arrays.asList(input.split(",")));
            case "Set<Integer>":
                return Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toSet());
            case "int[]":
                String[] intArrayInput = input.split(" ");
                int[] intArray = new int[intArrayInput.length];
                for (int i = 0; i < intArrayInput.length; i++) {
                    intArray[i] = Integer.parseInt(intArrayInput[i].trim());
                }
                return intArray;
            case "String[]":
                return input.split(" ");
            default:
                throw new IllegalArgumentException("Unsupported parameter type: " + paramType);
        }
    }

    /**
     * Maps parameter types to their respective Java classes.
     */
    private static Class<?> getClassForType(String paramType) {
        switch (paramType) {
            case "int":
                return int.class;
            case "double":
                return double.class;
            case "float":
                return float.class;
            case "long":
                return long.class;
            case "String":
                return String.class;
            case "char":
                return char.class;
            case "boolean":
                return boolean.class;
            case "List<String>":
                return List.class;
            case "List<Integer>":
                return List.class;
            case "Set<String>":
                return Set.class;
            case "Set<Integer>":
                return Set.class;
            case "int[]":
                return int[].class;
            case "String[]":
                return String[].class;
            default:
                throw new IllegalArgumentException("Unsupported parameter type: " + paramType);
        }
    }

//    public static void main(String[] args) {
//        // Example usage:
//        String methodDefinition = "public int firstUniqChar(String s)";
//        runTheMethod(methodDefinition, Solutions.class);
//    }
}

//class Solution {
//    public int firstUniqChar(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
