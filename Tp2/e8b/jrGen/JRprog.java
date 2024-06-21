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
	public Cap_ext_ op_lector_intTovoid;
	public Cap_ext_ JRget_op_lector_intTovoid() {
		return op_lector_intTovoid;
	}
	public void JRset_op_lector_intTovoid(Cap_ext_ op_lector_intTovoid) {
		this.op_lector_intTovoid = op_lector_intTovoid;
	}

	public Cap_ext_ op_escritor_intTovoid;
	public Cap_ext_ JRget_op_escritor_intTovoid() {
		return op_escritor_intTovoid;
	}
	public void JRset_op_escritor_intTovoid(Cap_ext_ op_escritor_intTovoid) {
		this.op_escritor_intTovoid = op_escritor_intTovoid;
	}

	public Cap_ext_ op_espera_intTovoid;
	public Cap_ext_ JRget_op_espera_intTovoid() {
		return op_espera_intTovoid;
	}
	public void JRset_op_espera_intTovoid(Cap_ext_ op_espera_intTovoid) {
		this.op_espera_intTovoid = op_espera_intTovoid;
	}

	public Cap_ext_ op_mutexE_voidTovoid;
	public Cap_ext_ JRget_op_mutexE_voidTovoid() {
		return op_mutexE_voidTovoid;
	}
	public void JRset_op_mutexE_voidTovoid(Cap_ext_ op_mutexE_voidTovoid) {
		this.op_mutexE_voidTovoid = op_mutexE_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_mutexL_voidTovoid;
	public Cap_ext_ JRget_op_mutexL_voidTovoid() {
		return op_mutexL_voidTovoid;
	}
	public void JRset_op_mutexL_voidTovoid(Cap_ext_ op_mutexL_voidTovoid) {
		this.op_mutexL_voidTovoid = op_mutexL_voidTovoid;
	}

	public Cap_ext_ op_lectores_voidTovoid;
	public Cap_ext_ JRget_op_lectores_voidTovoid() {
		return op_lectores_voidTovoid;
	}
	public void JRset_op_lectores_voidTovoid(Cap_ext_ op_lectores_voidTovoid) {
		this.op_lectores_voidTovoid = op_lectores_voidTovoid;
	}

	public Cap_ext_ op_escritores_voidTovoid;
	public Cap_ext_ JRget_op_escritores_voidTovoid() {
		return op_escritores_voidTovoid;
	}
	public void JRset_op_escritores_voidTovoid(Cap_ext_ op_escritores_voidTovoid) {
		this.op_escritores_voidTovoid = op_escritores_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_lector_intTovoid = copy.op_lector_intTovoid;
	this.op_escritor_intTovoid = copy.op_escritor_intTovoid;
	this.op_espera_intTovoid = copy.op_espera_intTovoid;
	this.op_mutexE_voidTovoid = copy.op_mutexE_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_mutexL_voidTovoid = copy.op_mutexL_voidTovoid;
	this.op_lectores_voidTovoid = copy.op_lectores_voidTovoid;
	this.op_escritores_voidTovoid = copy.op_escritores_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_lector_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_escritor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutexE_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_mutexL_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_lectores_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);
	this.op_escritores_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[7]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_lector_intTovoid = Cap_ext_.noop;
	this.op_escritor_intTovoid = Cap_ext_.noop;
	this.op_espera_intTovoid = Cap_ext_.noop;
	this.op_mutexE_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_mutexL_voidTovoid = Cap_ext_.noop;
	this.op_lectores_voidTovoid = Cap_ext_.noop;
	this.op_escritores_voidTovoid = Cap_ext_.noop;

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
