package Alphastar.Course.AdvancedSilverA.MicallaneousProblems;

import java.util.*;
import java.io.*;

class LemonadeLine {
  // CHANGE ME! (for old usaco)
  public static void main(String[] args) throws IOException {
    Kattio sc = new Kattio("line");

    int N = sc.nextInt();
    Integer[] cows = new Integer[N];
    for (int i = 0; i < N; i++) {
      cows[i] = sc.nextInt();
    }
    int size = 0;
    Arrays.sort(cows, Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      if (cows[i] >= size) {
        size++;
      } else {
        break;
      }
    }
    // Print out the answer down here

    sc.println(size);
    sc.close();
  }

  static class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;

    // standard input
    public Kattio() {
      this(System.in, System.out);
    }

    public Kattio(InputStream i, OutputStream o) {
      super(o);
      r = new BufferedReader(new InputStreamReader(i));
    }

    // USACO-style file input
    public Kattio(String problemName) throws IOException {
      super(problemName + ".out");
      r = new BufferedReader(new FileReader(problemName + ".in"));
    }

    // returns null if no more input
    public String next() {
      try {
        while (st == null || !st.hasMoreTokens())
          st = new StringTokenizer(r.readLine());
        return st.nextToken();
      } catch (Exception e) {
      }
      return null;
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}