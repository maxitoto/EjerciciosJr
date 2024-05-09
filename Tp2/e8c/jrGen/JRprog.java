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
	public Cap_ext_ op_accion_intTovoid;
	public Cap_ext_ JRget_op_accion_intTovoid() {
		return op_accion_intTovoid;
	}
	public void JRset_op_accion_intTovoid(Cap_ext_ op_accion_intTovoid) {
		this.op_accion_intTovoid = op_accion_intTovoid;
	}

	public Cap_ext_ op_l_intTovoid;
	public Cap_ext_ JRget_op_l_intTovoid() {
		return op_l_intTovoid;
	}
	public void JRset_op_l_intTovoid(Cap_ext_ op_l_intTovoid) {
		this.op_l_intTovoid = op_l_intTovoid;
	}

	public Cap_ext_ op_e_intTovoid;
	public Cap_ext_ JRget_op_e_intTovoid() {
		return op_e_intTovoid;
	}
	public void JRset_op_e_intTovoid(Cap_ext_ op_e_intTovoid) {
		this.op_e_intTovoid = op_e_intTovoid;
	}

	public Cap_ext_ op_mutexAccion_voidTovoid;
	public Cap_ext_ JRget_op_mutexAccion_voidTovoid() {
		return op_mutexAccion_voidTovoid;
	}
	public void JRset_op_mutexAccion_voidTovoid(Cap_ext_ op_mutexAccion_voidTovoid) {
		this.op_mutexAccion_voidTovoid = op_mutexAccion_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_accion_intTovoid = copy.op_accion_intTovoid;
	this.op_l_intTovoid = copy.op_l_intTovoid;
	this.op_e_intTovoid = copy.op_e_intTovoid;
	this.op_mutexAccion_voidTovoid = copy.op_mutexAccion_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_accion_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_l_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_e_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutexAccion_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_accion_intTovoid = Cap_ext_.noop;
	this.op_l_intTovoid = Cap_ext_.noop;
	this.op_e_intTovoid = Cap_ext_.noop;
	this.op_mutexAccion_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;

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
