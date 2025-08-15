/* Rabin-Karp String Matching */
class RabinKarp {
    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        search(pat, txt);
    }

    static void search(String pat, String txt) {
        int d = 256;
        int q = 101; // prime
        int M = pat.length(), N = txt.length();
        int p = 0, t = 0, h = 1;
        for (int i = 0; i < M - 1; i++)
            h = (h * d) % q;
        for (int i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        for (int i = 0; i <= N - M; i++) {
            if (p == t) {
                int j;
                for (j = 0; j < M; j++)
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;
                if (t < 0)
                    t += q;
            }
        }
    }
}
