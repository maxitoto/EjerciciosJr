/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRPizzeria
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_done_voidTovoid;
	public Cap_ext_ JRget_op_done_voidTovoid() {
		return op_done_voidTovoid;
	}
	public void JRset_op_done_voidTovoid(Cap_ext_ op_done_voidTovoid) {
		this.op_done_voidTovoid = op_done_voidTovoid;
	}

	public Cap_ext_ op_ayudante_morron_voidTovoid;
	public Cap_ext_ JRget_op_ayudante_morron_voidTovoid() {
		return op_ayudante_morron_voidTovoid;
	}
	public void JRset_op_ayudante_morron_voidTovoid(Cap_ext_ op_ayudante_morron_voidTovoid) {
		this.op_ayudante_morron_voidTovoid = op_ayudante_morron_voidTovoid;
	}

	public Cap_ext_ op_ayudante_salsa_voidTovoid;
	public Cap_ext_ JRget_op_ayudante_salsa_voidTovoid() {
		return op_ayudante_salsa_voidTovoid;
	}
	public void JRset_op_ayudante_salsa_voidTovoid(Cap_ext_ op_ayudante_salsa_voidTovoid) {
		this.op_ayudante_salsa_voidTovoid = op_ayudante_salsa_voidTovoid;
	}

	public Cap_ext_ op_ayudante_queso_voidTovoid;
	public Cap_ext_ JRget_op_ayudante_queso_voidTovoid() {
		return op_ayudante_queso_voidTovoid;
	}
	public void JRset_op_ayudante_queso_voidTovoid(Cap_ext_ op_ayudante_queso_voidTovoid) {
		this.op_ayudante_queso_voidTovoid = op_ayudante_queso_voidTovoid;
	}

	public Cap_ext_ op_chef_voidTovoid;
	public Cap_ext_ JRget_op_chef_voidTovoid() {
		return op_chef_voidTovoid;
	}
	public void JRset_op_chef_voidTovoid(Cap_ext_ op_chef_voidTovoid) {
		this.op_chef_voidTovoid = op_chef_voidTovoid;
	}

	public JRPizzeria(JRPizzeria copy)
	{
	this.op_done_voidTovoid = copy.op_done_voidTovoid;
	this.op_ayudante_morron_voidTovoid = copy.op_ayudante_morron_voidTovoid;
	this.op_ayudante_salsa_voidTovoid = copy.op_ayudante_salsa_voidTovoid;
	this.op_ayudante_queso_voidTovoid = copy.op_ayudante_queso_voidTovoid;
	this.op_chef_voidTovoid = copy.op_chef_voidTovoid;

	}
	public JRPizzeria(Object ... opSig)
	{
	this.op_done_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_ayudante_morron_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_ayudante_salsa_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_ayudante_queso_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_chef_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRPizzeria(boolean dummy)	{
	    super(dummy);
	this.op_done_voidTovoid = Cap_ext_.noop;
	this.op_ayudante_morron_voidTovoid = Cap_ext_.noop;
	this.op_ayudante_salsa_voidTovoid = Cap_ext_.noop;
	this.op_ayudante_queso_voidTovoid = Cap_ext_.noop;
	this.op_chef_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRPizzeria(true);
	}
    }
