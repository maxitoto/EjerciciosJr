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
	public Cap_ext_ op_L_intTovoid;
	public Cap_ext_ JRget_op_L_intTovoid() {
		return op_L_intTovoid;
	}
	public void JRset_op_L_intTovoid(Cap_ext_ op_L_intTovoid) {
		this.op_L_intTovoid = op_L_intTovoid;
	}

	public Cap_ext_ op_E_intTovoid;
	public Cap_ext_ JRget_op_E_intTovoid() {
		return op_E_intTovoid;
	}
	public void JRset_op_E_intTovoid(Cap_ext_ op_E_intTovoid) {
		this.op_E_intTovoid = op_E_intTovoid;
	}

	public Cap_ext_ op_espera_intTovoid;
	public Cap_ext_ JRget_op_espera_intTovoid() {
		return op_espera_intTovoid;
	}
	public void JRset_op_espera_intTovoid(Cap_ext_ op_espera_intTovoid) {
		this.op_espera_intTovoid = op_espera_intTovoid;
	}

	public Cap_ext_ op_lectores_voidTovoid;
	public Cap_ext_ JRget_op_lectores_voidTovoid() {
		return op_lectores_voidTovoid;
	}
	public void JRset_op_lectores_voidTovoid(Cap_ext_ op_lectores_voidTovoid) {
		this.op_lectores_voidTovoid = op_lectores_voidTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_escribir_voidTovoid;
	public Cap_ext_ JRget_op_escribir_voidTovoid() {
		return op_escribir_voidTovoid;
	}
	public void JRset_op_escribir_voidTovoid(Cap_ext_ op_escribir_voidTovoid) {
		this.op_escribir_voidTovoid = op_escribir_voidTovoid;
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
	this.op_L_intTovoid = copy.op_L_intTovoid;
	this.op_E_intTovoid = copy.op_E_intTovoid;
	this.op_espera_intTovoid = copy.op_espera_intTovoid;
	this.op_lectores_voidTovoid = copy.op_lectores_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_escribir_voidTovoid = copy.op_escribir_voidTovoid;
	this.op_escritores_voidTovoid = copy.op_escritores_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_L_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_E_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_lectores_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_escribir_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_escritores_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_L_intTovoid = Cap_ext_.noop;
	this.op_E_intTovoid = Cap_ext_.noop;
	this.op_espera_intTovoid = Cap_ext_.noop;
	this.op_lectores_voidTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_escribir_voidTovoid = Cap_ext_.noop;
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
