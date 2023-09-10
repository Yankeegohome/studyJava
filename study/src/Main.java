import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        int [] a = {1,3,5,6,7,8};
        int b = Arrays.stream(a).max().getAsInt();
        int c = Arrays.stream(a).min().getAsInt();
        ArrayList<Integer> newList = new ArrayList<>();
        while (c <= b) {
            newList.add(c);
            c++;
        }
        int [] numArray = new int [newList.size()];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (Integer) newList.get(i);
        }
        System.out.println(Arrays.toString(numArray));
    }
}
//    public static boolean validatePin(String pin) {
//        try {
//            Integer a = Integer.parseInt(pin);
//            if ((pin.length() == 4 || pin.length() == 6) && (a != null) && (a == 0 || a > 999)) {
//                return true;
//            } else {return false;}
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
//
//    }
//}
//    public static int[] find (int base, int limit) {
//
//        int [] c = new int[a/b];
//        c[0] = base;
//        for (int i = 1; i < c.length; i++) {
//            c[i] = c[i-1] + a;
//        }
//        return c;
//    }
//}
//    public static long [] powersOfTwo(int n) {
//        long[] a = new long[n+1];
//        a[0] = 1;
//        for (int i = 1; i < a.length; i++) {
//            a[i] = a[i - 1] * 2;
//        }
//        return a;



//    public static Object[] removeEveryOther(Object[] arr) {
//        // happy coding
//        List<Object> list = new ArrayList<>(Arrays.asList(arr));
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                list.remove(arr[i]);
//            }
//        }
//       arr = list.toArray(new Object[]{list.size()});
//       return arr;
//    }



//    public static String doubleChar(String s) {
//        String[] str = s.split("");
//        String[] str1 = new String[str.length * 2];
//        int a = 0;
//        for (int i = 0; i < str.length; i++) {
//            str1[i] = str[a];
//            str1[i+1] = str[a];
//            i++;
//            a++;
//        }
//        return Arrays.toString(str1);

//    public static int[] invert(int[] array) {
//        int[] invertArr = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                invertArr[i] = -array[i];
//            } else if (array[i] <= 0) {
//                invertArr[i] = Math.abs(array[i]);
//            }
//        }
//        return invertArr;
//    }

//    public static int enough(int cap, int on, int wait) {
//        int a = (cap - on) - wait;
//        if (a >= 0) {
//            return 0;
//        } else {
//            return Math.abs(a);
//        }
//    }

//    public static String howMuchILoveYou(int nb_petals) {
//        int s = nb_petals % 6;
//        if (s == 1) { return "I love you";}
//        else if (s == 3) {return "a lot";}
//        else if (s == 4) {return "passionately";}
//        else if (s == 5) {return "madly";}
//        else if (s == 6) {return "not at all";}
//        else if (s == 2) {return "a little";}
//
//        return "";
//    }


