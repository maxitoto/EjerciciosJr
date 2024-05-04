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
	public Cap_ext_ op_consumidor_intTovoid;
	public Cap_ext_ JRget_op_consumidor_intTovoid() {
		return op_consumidor_intTovoid;
	}
	public void JRset_op_consumidor_intTovoid(Cap_ext_ op_consumidor_intTovoid) {
		this.op_consumidor_intTovoid = op_consumidor_intTovoid;
	}

	public Cap_ext_ op_productor_intTovoid;
	public Cap_ext_ JRget_op_productor_intTovoid() {
		return op_productor_intTovoid;
	}
	public void JRset_op_productor_intTovoid(Cap_ext_ op_productor_intTovoid) {
		this.op_productor_intTovoid = op_productor_intTovoid;
	}

	public Cap_ext_ op_espera_intTovoid;
	public Cap_ext_ JRget_op_espera_intTovoid() {
		return op_espera_intTovoid;
	}
	public void JRset_op_espera_intTovoid(Cap_ext_ op_espera_intTovoid) {
		this.op_espera_intTovoid = op_espera_intTovoid;
	}

	public Cap_ext_ op_sc_voidTovoid;
	public Cap_ext_ JRget_op_sc_voidTovoid() {
		return op_sc_voidTovoid;
	}
	public void JRset_op_sc_voidTovoid(Cap_ext_ op_sc_voidTovoid) {
		this.op_sc_voidTovoid = op_sc_voidTovoid;
	}

	public Cap_ext_ op_sp_voidTovoid;
	public Cap_ext_ JRget_op_sp_voidTovoid() {
		return op_sp_voidTovoid;
	}
	public void JRset_op_sp_voidTovoid(Cap_ext_ op_sp_voidTovoid) {
		this.op_sp_voidTovoid = op_sp_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_consumidor_intTovoid = copy.op_consumidor_intTovoid;
	this.op_productor_intTovoid = copy.op_productor_intTovoid;
	this.op_espera_intTovoid = copy.op_espera_intTovoid;
	this.op_sc_voidTovoid = copy.op_sc_voidTovoid;
	this.op_sp_voidTovoid = copy.op_sp_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_consumidor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_productor_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_sc_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_sp_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_consumidor_intTovoid = Cap_ext_.noop;
	this.op_productor_intTovoid = Cap_ext_.noop;
	this.op_espera_intTovoid = Cap_ext_.noop;
	this.op_sc_voidTovoid = Cap_ext_.noop;
	this.op_sp_voidTovoid = Cap_ext_.noop;

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
