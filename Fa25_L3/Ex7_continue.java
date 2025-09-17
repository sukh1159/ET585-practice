public class Ex7_continue {
  public static void main(String[] args) {
    // for loop
    for (int i = 0; i < 100; i++) {
      if (i%7==0) continue;
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
