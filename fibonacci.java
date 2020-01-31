class Main {
  public static void main(String args[]) {
  
  /*
  * this program receives an N number and returns the 
  * first N numbers in the fibonacci sequence.
  */

    Scanner input = new Scanner(System.in);
    
    String answer = "";
    int old = 0;
    int nw = 1;
    boolean c = true;

    for (int num = input.nextInt();num>0;num--) {
      if (c) {
        answer += Integer.toString(old)+" ";
        old += nw;
        c = false;
      }
      else if (!c) {
        answer += Integer.toString(nw)+" ";
        nw += old;
        c = true;
      }
    }
    System.out.println(answer.trim());
  }
}
