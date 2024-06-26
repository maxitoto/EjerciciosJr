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
	public Cap_ext_ op_op3_voidTovoid;
	public Cap_ext_ JRget_op_op3_voidTovoid() {
		return op_op3_voidTovoid;
	}
	public void JRset_op_op3_voidTovoid(Cap_ext_ op_op3_voidTovoid) {
		this.op_op3_voidTovoid = op_op3_voidTovoid;
	}

	public Cap_ext_ op_op2_voidTovoid;
	public Cap_ext_ JRget_op_op2_voidTovoid() {
		return op_op2_voidTovoid;
	}
	public void JRset_op_op2_voidTovoid(Cap_ext_ op_op2_voidTovoid) {
		this.op_op2_voidTovoid = op_op2_voidTovoid;
	}

	public Cap_ext_ op_op1_voidTovoid;
	public Cap_ext_ JRget_op_op1_voidTovoid() {
		return op_op1_voidTovoid;
	}
	public void JRset_op_op1_voidTovoid(Cap_ext_ op_op1_voidTovoid) {
		this.op_op1_voidTovoid = op_op1_voidTovoid;
	}

	public Cap_ext_ op_montador_voidTovoid;
	public Cap_ext_ JRget_op_montador_voidTovoid() {
		return op_montador_voidTovoid;
	}
	public void JRset_op_montador_voidTovoid(Cap_ext_ op_montador_voidTovoid) {
		this.op_montador_voidTovoid = op_montador_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_op3_voidTovoid = copy.op_op3_voidTovoid;
	this.op_op2_voidTovoid = copy.op_op2_voidTovoid;
	this.op_op1_voidTovoid = copy.op_op1_voidTovoid;
	this.op_montador_voidTovoid = copy.op_montador_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_op3_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_op2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_op1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_montador_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_op3_voidTovoid = Cap_ext_.noop;
	this.op_op2_voidTovoid = Cap_ext_.noop;
	this.op_op1_voidTovoid = Cap_ext_.noop;
	this.op_montador_voidTovoid = Cap_ext_.noop;

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
