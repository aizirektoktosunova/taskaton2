
import java.util.concurrent.TimeUnit;

public class FriendsScene {

    static class Character implements Runnable {
        private String name;
        private String dialogue;

        public Character(String name, String dialogue) {
            this.name = name;
            this.dialogue = dialogue;
        }

        @Override
        public void run() {
            System.out.println(name + ": " + dialogue);
        }
    }

    public static void main(String[] args) {
        Character chandler = new Character("Chandler", "Could I BE any more sarcastic?");
        Character joey = new Character("Joey", "How you doin'?");
        Character phoebe = new Character("Phoebe", "Smelly cat, smelly cat...");
        Character monica = new Character("Monica", "Welcome to the real world. It sucks.");
        Character rachel = new Character("Rachel", "It's like all my life everyone has always told me, \"You're a shoe!\"");
        Character ross = new Character("Ross", "We were on a break!");

        Thread chandlerThread = new Thread(chandler);
        Thread joeyThread = new Thread(joey);
        Thread phoebeThread = new Thread(phoebe);
        Thread monicaThread = new Thread(monica);
        Thread rachelThread = new Thread(rachel);
        Thread rossThread = new Thread(ross);

        chandlerThread.start();
        joeyThread.start();
        phoebeThread.start();
        monicaThread.start();
        rachelThread.start();
        rossThread.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


