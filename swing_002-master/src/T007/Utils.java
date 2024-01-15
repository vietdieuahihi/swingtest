package T007;

public class Utils {

    public static boolean isEmpty(String value) {
        if (value == null) return true;
        return value.isEmpty();
    }

    // khi tất cả các giá trị của value = null hoặc
    // empty -> return true
    // ngược lại return false

    // vi du: String[] a = {null, "", null, null, ""}
    public static boolean isEmpty(String[] value) {
        if (value.length == 0) return true;

        boolean result = true;
        for (int i = 0; i < value.length; i++) {
            String s = value[i];

            result = s == null || s.isEmpty();
           /* if (s != null && !s.isEmpty()) {
                return false;
            }*/
        }

        return result;
    }

    public static String reverse(String value) {
        if (isEmpty(value)) return "";
        String result = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            result = result + value.charAt(i);
        }
        return result;
    }
}
