public class Ex6_break {
  public static void main(String[] args) {
    // for loop
    for (int i = 0; i < 5; i++) {
      if (i==3) break;
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
/*
i = 0; i<5 => true, print(i) => 0, then do i++ => i 1
i = 1; i<5 =>
...
..
i = 5; i<5 => False, then terminate
*/
