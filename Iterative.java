
public class Iterative {

  // I am soo proud of you for realising that this is a simple factorial method
  public long fact(long n) {
    if (n == 1) {
      return 1;
    } else {
      return n * fact(n - 1);
    }
  }

}
