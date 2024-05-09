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
	public Cap_ext_ op_rojos_intTovoid;
	public Cap_ext_ JRget_op_rojos_intTovoid() {
		return op_rojos_intTovoid;
	}
	public void JRset_op_rojos_intTovoid(Cap_ext_ op_rojos_intTovoid) {
		this.op_rojos_intTovoid = op_rojos_intTovoid;
	}

	public Cap_ext_ op_blancos_intTovoid;
	public Cap_ext_ JRget_op_blancos_intTovoid() {
		return op_blancos_intTovoid;
	}
	public void JRset_op_blancos_intTovoid(Cap_ext_ op_blancos_intTovoid) {
		this.op_blancos_intTovoid = op_blancos_intTovoid;
	}

	public Cap_ext_ op_x_voidTovoid;
	public Cap_ext_ JRget_op_x_voidTovoid() {
		return op_x_voidTovoid;
	}
	public void JRset_op_x_voidTovoid(Cap_ext_ op_x_voidTovoid) {
		this.op_x_voidTovoid = op_x_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_entraRojo_voidTovoid;
	public Cap_ext_ JRget_op_entraRojo_voidTovoid() {
		return op_entraRojo_voidTovoid;
	}
	public void JRset_op_entraRojo_voidTovoid(Cap_ext_ op_entraRojo_voidTovoid) {
		this.op_entraRojo_voidTovoid = op_entraRojo_voidTovoid;
	}

	public Cap_ext_ op_entraBlanco_voidTovoid;
	public Cap_ext_ JRget_op_entraBlanco_voidTovoid() {
		return op_entraBlanco_voidTovoid;
	}
	public void JRset_op_entraBlanco_voidTovoid(Cap_ext_ op_entraBlanco_voidTovoid) {
		this.op_entraBlanco_voidTovoid = op_entraBlanco_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_rojos_intTovoid = copy.op_rojos_intTovoid;
	this.op_blancos_intTovoid = copy.op_blancos_intTovoid;
	this.op_x_voidTovoid = copy.op_x_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_entraRojo_voidTovoid = copy.op_entraRojo_voidTovoid;
	this.op_entraBlanco_voidTovoid = copy.op_entraBlanco_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_rojos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_blancos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_x_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_entraRojo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_entraBlanco_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_rojos_intTovoid = Cap_ext_.noop;
	this.op_blancos_intTovoid = Cap_ext_.noop;
	this.op_x_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_entraRojo_voidTovoid = Cap_ext_.noop;
	this.op_entraBlanco_voidTovoid = Cap_ext_.noop;

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
