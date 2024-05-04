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
	public Cap_ext_ op_cliente_intTovoid;
	public Cap_ext_ JRget_op_cliente_intTovoid() {
		return op_cliente_intTovoid;
	}
	public void JRset_op_cliente_intTovoid(Cap_ext_ op_cliente_intTovoid) {
		this.op_cliente_intTovoid = op_cliente_intTovoid;
	}

	public Cap_ext_ op_barberia_voidTovoid;
	public Cap_ext_ JRget_op_barberia_voidTovoid() {
		return op_barberia_voidTovoid;
	}
	public void JRset_op_barberia_voidTovoid(Cap_ext_ op_barberia_voidTovoid) {
		this.op_barberia_voidTovoid = op_barberia_voidTovoid;
	}

	public Cap_ext_ op_termino_voidTovoid;
	public Cap_ext_ JRget_op_termino_voidTovoid() {
		return op_termino_voidTovoid;
	}
	public void JRset_op_termino_voidTovoid(Cap_ext_ op_termino_voidTovoid) {
		this.op_termino_voidTovoid = op_termino_voidTovoid;
	}

	public Cap_ext_ op_pagar_voidTovoid;
	public Cap_ext_ JRget_op_pagar_voidTovoid() {
		return op_pagar_voidTovoid;
	}
	public void JRset_op_pagar_voidTovoid(Cap_ext_ op_pagar_voidTovoid) {
		this.op_pagar_voidTovoid = op_pagar_voidTovoid;
	}

	public Cap_ext_ op_cobrar_voidTovoid;
	public Cap_ext_ JRget_op_cobrar_voidTovoid() {
		return op_cobrar_voidTovoid;
	}
	public void JRset_op_cobrar_voidTovoid(Cap_ext_ op_cobrar_voidTovoid) {
		this.op_cobrar_voidTovoid = op_cobrar_voidTovoid;
	}

	public Cap_ext_ op_espera_voidTovoid;
	public Cap_ext_ JRget_op_espera_voidTovoid() {
		return op_espera_voidTovoid;
	}
	public void JRset_op_espera_voidTovoid(Cap_ext_ op_espera_voidTovoid) {
		this.op_espera_voidTovoid = op_espera_voidTovoid;
	}

	public Cap_ext_ op_silla_voidTovoid;
	public Cap_ext_ JRget_op_silla_voidTovoid() {
		return op_silla_voidTovoid;
	}
	public void JRset_op_silla_voidTovoid(Cap_ext_ op_silla_voidTovoid) {
		this.op_silla_voidTovoid = op_silla_voidTovoid;
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
	this.op_cliente_intTovoid = copy.op_cliente_intTovoid;
	this.op_barberia_voidTovoid = copy.op_barberia_voidTovoid;
	this.op_termino_voidTovoid = copy.op_termino_voidTovoid;
	this.op_pagar_voidTovoid = copy.op_pagar_voidTovoid;
	this.op_cobrar_voidTovoid = copy.op_cobrar_voidTovoid;
	this.op_espera_voidTovoid = copy.op_espera_voidTovoid;
	this.op_silla_voidTovoid = copy.op_silla_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_cliente_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_barberia_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_termino_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_pagar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_cobrar_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_espera_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_silla_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[7]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_cliente_intTovoid = Cap_ext_.noop;
	this.op_barberia_voidTovoid = Cap_ext_.noop;
	this.op_termino_voidTovoid = Cap_ext_.noop;
	this.op_pagar_voidTovoid = Cap_ext_.noop;
	this.op_cobrar_voidTovoid = Cap_ext_.noop;
	this.op_espera_voidTovoid = Cap_ext_.noop;
	this.op_silla_voidTovoid = Cap_ext_.noop;
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
