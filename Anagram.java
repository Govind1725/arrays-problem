public class Govindh {
    public static void main(String arg[]) {
        int s[] = new int[256];
        String a = "ssttt";
        String b = "ttsst";
        int flage = 0;
        for (int i = 0; i < a.length(); i++) {
            s[a.charAt(i)]++;
        }
        for (int i = 0; i < b.length(); i++) {
            s[b.charAt(i)]--;
        }

        for (int e : s) {
            if (e != 0) {
                System.out.println("false");
                flage = 1;
                break;
            }
        }
        if (flage == 0) {
            System.out.println("true");
        }
    }
}
