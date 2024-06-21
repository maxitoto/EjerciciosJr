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
	public Cap_ext_ op_ayudanteC_voidTovoid;
	public Cap_ext_ JRget_op_ayudanteC_voidTovoid() {
		return op_ayudanteC_voidTovoid;
	}
	public void JRset_op_ayudanteC_voidTovoid(Cap_ext_ op_ayudanteC_voidTovoid) {
		this.op_ayudanteC_voidTovoid = op_ayudanteC_voidTovoid;
	}

	public Cap_ext_ op_ayudanteB_voidTovoid;
	public Cap_ext_ JRget_op_ayudanteB_voidTovoid() {
		return op_ayudanteB_voidTovoid;
	}
	public void JRset_op_ayudanteB_voidTovoid(Cap_ext_ op_ayudanteB_voidTovoid) {
		this.op_ayudanteB_voidTovoid = op_ayudanteB_voidTovoid;
	}

	public Cap_ext_ op_ayudanteA_voidTovoid;
	public Cap_ext_ JRget_op_ayudanteA_voidTovoid() {
		return op_ayudanteA_voidTovoid;
	}
	public void JRset_op_ayudanteA_voidTovoid(Cap_ext_ op_ayudanteA_voidTovoid) {
		this.op_ayudanteA_voidTovoid = op_ayudanteA_voidTovoid;
	}

	public Cap_ext_ op_cocinero_voidTovoid;
	public Cap_ext_ JRget_op_cocinero_voidTovoid() {
		return op_cocinero_voidTovoid;
	}
	public void JRset_op_cocinero_voidTovoid(Cap_ext_ op_cocinero_voidTovoid) {
		this.op_cocinero_voidTovoid = op_cocinero_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_ayudanteC_voidTovoid = copy.op_ayudanteC_voidTovoid;
	this.op_ayudanteB_voidTovoid = copy.op_ayudanteB_voidTovoid;
	this.op_ayudanteA_voidTovoid = copy.op_ayudanteA_voidTovoid;
	this.op_cocinero_voidTovoid = copy.op_cocinero_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_ayudanteC_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_ayudanteB_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_ayudanteA_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_cocinero_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_ayudanteC_voidTovoid = Cap_ext_.noop;
	this.op_ayudanteB_voidTovoid = Cap_ext_.noop;
	this.op_ayudanteA_voidTovoid = Cap_ext_.noop;
	this.op_cocinero_voidTovoid = Cap_ext_.noop;

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
