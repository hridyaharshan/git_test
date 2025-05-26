//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    // Print array method
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int n = 8;
        // array with N size
        int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };

        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        // odd and even arrays with size
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        // odd and even array iterator
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
        }
        // print array method
        System.out.print("Even Array contains: ");
        printArray(even);
        System.out.print("Odd Array contains: ");
        printArray(odd);


                int num = 29;
                boolean flag = false;

                // 0 and 1 are not prime numbers
                if (num == 0 || num == 1) {
                    flag = true;
                }

                for (int i = 2; i <= num / 2; ++i) {

                    // condition for nonprime number
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                    System.out.println(num + " is a prime number.");
                else
                    System.out.println(num + " is not a prime number.");
          System.out.println(" ");
            }



    }
