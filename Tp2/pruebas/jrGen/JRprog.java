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
	public Cap_ext_ op_lectores_intTovoid;
	public Cap_ext_ JRget_op_lectores_intTovoid() {
		return op_lectores_intTovoid;
	}
	public void JRset_op_lectores_intTovoid(Cap_ext_ op_lectores_intTovoid) {
		this.op_lectores_intTovoid = op_lectores_intTovoid;
	}

	public Cap_ext_ op_escritores_intTovoid;
	public Cap_ext_ JRget_op_escritores_intTovoid() {
		return op_escritores_intTovoid;
	}
	public void JRset_op_escritores_intTovoid(Cap_ext_ op_escritores_intTovoid) {
		this.op_escritores_intTovoid = op_escritores_intTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_vacios_voidTovoid;
	public Cap_ext_ JRget_op_vacios_voidTovoid() {
		return op_vacios_voidTovoid;
	}
	public void JRset_op_vacios_voidTovoid(Cap_ext_ op_vacios_voidTovoid) {
		this.op_vacios_voidTovoid = op_vacios_voidTovoid;
	}

	public Cap_ext_ op_llenos_voidTovoid;
	public Cap_ext_ JRget_op_llenos_voidTovoid() {
		return op_llenos_voidTovoid;
	}
	public void JRset_op_llenos_voidTovoid(Cap_ext_ op_llenos_voidTovoid) {
		this.op_llenos_voidTovoid = op_llenos_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_lectores_intTovoid = copy.op_lectores_intTovoid;
	this.op_escritores_intTovoid = copy.op_escritores_intTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_vacios_voidTovoid = copy.op_vacios_voidTovoid;
	this.op_llenos_voidTovoid = copy.op_llenos_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_lectores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_escritores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_vacios_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_llenos_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_lectores_intTovoid = Cap_ext_.noop;
	this.op_escritores_intTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_vacios_voidTovoid = Cap_ext_.noop;
	this.op_llenos_voidTovoid = Cap_ext_.noop;

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
