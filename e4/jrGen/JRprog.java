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

	public Cap_ext_ op_testandset_intToboolean;
	public Cap_ext_ JRget_op_testandset_intToboolean() {
		return op_testandset_intToboolean;
	}
	public void JRset_op_testandset_intToboolean(Cap_ext_ op_testandset_intToboolean) {
		this.op_testandset_intToboolean = op_testandset_intToboolean;
	}

	public Cap_ext_ op_espera_intTovoid;
	public Cap_ext_ JRget_op_espera_intTovoid() {
		return op_espera_intTovoid;
	}
	public void JRset_op_espera_intTovoid(Cap_ext_ op_espera_intTovoid) {
		this.op_espera_intTovoid = op_espera_intTovoid;
	}

	public Cap_ext_ op_x_voidTovoid;
	public Cap_ext_ JRget_op_x_voidTovoid() {
		return op_x_voidTovoid;
	}
	public void JRset_op_x_voidTovoid(Cap_ext_ op_x_voidTovoid) {
		this.op_x_voidTovoid = op_x_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_p2_voidTovoid = copy.op_p2_voidTovoid;
	this.op_p1_voidTovoid = copy.op_p1_voidTovoid;
	this.op_testandset_intToboolean = copy.op_testandset_intToboolean;
	this.op_espera_intTovoid = copy.op_espera_intTovoid;
	this.op_x_voidTovoid = copy.op_x_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_p2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_p1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_testandset_intToboolean = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_espera_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_x_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_p2_voidTovoid = Cap_ext_.noop;
	this.op_p1_voidTovoid = Cap_ext_.noop;
	this.op_testandset_intToboolean = Cap_ext_.noop;
	this.op_espera_intTovoid = Cap_ext_.noop;
	this.op_x_voidTovoid = Cap_ext_.noop;

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
