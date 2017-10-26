public class PowerfulSpam {

	public static final int SPAM_AMOUNT = 100;

    public static void main(String[] args) {
        int i = 0;
			
        for (i = 0; i < SPAM_AMOUNT; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
				
    }
}
