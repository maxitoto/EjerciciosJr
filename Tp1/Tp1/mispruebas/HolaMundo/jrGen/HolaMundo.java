/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class HolaMundo extends java.lang.Object {
    { JRinit(); }
    
    public HolaMundo() {
        // Begin Expr2
        super();
        JRprocess();
    }
    
    public static void main(String[] args) {
        // Begin Expr2
        System.out.println("Hola Mundo");
    }
    protected boolean JRcalled = false;
    protected JRHolaMundo jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRHolaMundo();
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
