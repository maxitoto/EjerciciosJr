/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRTwoProcesses
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_p2_voidTovoid;
	public Cap_ext_ JRget_op_p2_voidTovoid() {
		return op_p2_voidTovoid;
	}
	public void JRset_op_p2_voidTovoid(Cap_ext_ op_p2_voidTovoid) {
		this.op_p2_voidTovoid = op_p2_voidTovoid;
	}

	public Cap_ext_ op_p1_voidTovoid;
	public Cap_ext_ JRget_op_p1_voidTovoid() {
		return op_p1_voidTovoid;
	}
	public void JRset_op_p1_voidTovoid(Cap_ext_ op_p1_voidTovoid) {
		this.op_p1_voidTovoid = op_p1_voidTovoid;
	}

	public JRTwoProcesses(JRTwoProcesses copy)
	{
	this.op_p2_voidTovoid = copy.op_p2_voidTovoid;
	this.op_p1_voidTovoid = copy.op_p1_voidTovoid;

	}
	public JRTwoProcesses(Object ... opSig)
	{
	this.op_p2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_p1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRTwoProcesses(boolean dummy)	{
	    super(dummy);
	this.op_p2_voidTovoid = Cap_ext_.noop;
	this.op_p1_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRTwoProcesses(true);
	}
    }
