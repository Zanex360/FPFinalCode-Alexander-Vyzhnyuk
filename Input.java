import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

public class Input {
    private static volatile boolean aDown = false;
    private static volatile boolean wDown = false;
    private static volatile boolean dDown = false;
    private static volatile boolean sDown = false;
    private static volatile boolean spaceDown = false;

    static {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED) {
                    if (e.getKeyCode() == KeyEvent.VK_W) Input.wDown = true;
                    if (e.getKeyCode() == KeyEvent.VK_A) Input.aDown = true;
                    if (e.getKeyCode() == KeyEvent.VK_S) Input.sDown = true;
                    if (e.getKeyCode() == KeyEvent.VK_D) Input.dDown = true;
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) Input.spaceDown = true;
                }

                if (e.getID() == KeyEvent.KEY_RELEASED) {
                    if (e.getKeyCode() == KeyEvent.VK_W) Input.wDown = false;
                    if (e.getKeyCode() == KeyEvent.VK_A) Input.aDown = false;
                    if (e.getKeyCode() == KeyEvent.VK_S) Input.sDown = false;
                    if (e.getKeyCode() == KeyEvent.VK_D) Input.dDown = false;
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) Input.spaceDown = false;
                }
                
                return true;
            }
        });
    }


    public synchronized static boolean getADown() { return Input.aDown; }
    public synchronized static boolean getWDown() { return Input.wDown; }
    public synchronized static boolean getSDown() { return Input.sDown; }
    public synchronized static boolean getDDown() { return Input.dDown; }
    public synchronized static boolean getSpaceDown() { return Input.spaceDown; }
}