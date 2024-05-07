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
	public Cap_ext_ op_x_voidTovoid;
	public Cap_ext_ JRget_op_x_voidTovoid() {
		return op_x_voidTovoid;
	}
	public void JRset_op_x_voidTovoid(Cap_ext_ op_x_voidTovoid) {
		this.op_x_voidTovoid = op_x_voidTovoid;
	}

	public Cap_ext_ op_entraBlanco_voidTovoid;
	public Cap_ext_ JRget_op_entraBlanco_voidTovoid() {
		return op_entraBlanco_voidTovoid;
	}
	public void JRset_op_entraBlanco_voidTovoid(Cap_ext_ op_entraBlanco_voidTovoid) {
		this.op_entraBlanco_voidTovoid = op_entraBlanco_voidTovoid;
	}

	public Cap_ext_ op_entraRojo_voidTovoid;
	public Cap_ext_ JRget_op_entraRojo_voidTovoid() {
		return op_entraRojo_voidTovoid;
	}
	public void JRset_op_entraRojo_voidTovoid(Cap_ext_ op_entraRojo_voidTovoid) {
		this.op_entraRojo_voidTovoid = op_entraRojo_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_x_voidTovoid = copy.op_x_voidTovoid;
	this.op_entraBlanco_voidTovoid = copy.op_entraBlanco_voidTovoid;
	this.op_entraRojo_voidTovoid = copy.op_entraRojo_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_x_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_entraBlanco_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_entraRojo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_x_voidTovoid = Cap_ext_.noop;
	this.op_entraBlanco_voidTovoid = Cap_ext_.noop;
	this.op_entraRojo_voidTovoid = Cap_ext_.noop;

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
