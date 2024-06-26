/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRprog
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_p_intTovoid;
	public Cap_ext_ JRget_op_p_intTovoid() {
		return op_p_intTovoid;
	}
	public void JRset_op_p_intTovoid(Cap_ext_ op_p_intTovoid) {
		this.op_p_intTovoid = op_p_intTovoid;
	}

	public Cap_ext_ op_mailbox_booleanTovoid;
	public Cap_ext_ JRget_op_mailbox_booleanTovoid() {
		return op_mailbox_booleanTovoid;
	}
	public void JRset_op_mailbox_booleanTovoid(Cap_ext_ op_mailbox_booleanTovoid) {
		this.op_mailbox_booleanTovoid = op_mailbox_booleanTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_p_intTovoid = copy.op_p_intTovoid;
	this.op_mailbox_booleanTovoid = copy.op_mailbox_booleanTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_p_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_mailbox_booleanTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_p_intTovoid = Cap_ext_.noop;
	this.op_mailbox_booleanTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRprog(true);
	}
    }
