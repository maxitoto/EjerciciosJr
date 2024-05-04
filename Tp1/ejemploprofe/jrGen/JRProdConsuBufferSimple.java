/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRProdConsuBufferSimple
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_Consumidor_voidTovoid;
	public Cap_ext_ JRget_op_Consumidor_voidTovoid() {
		return op_Consumidor_voidTovoid;
	}
	public void JRset_op_Consumidor_voidTovoid(Cap_ext_ op_Consumidor_voidTovoid) {
		this.op_Consumidor_voidTovoid = op_Consumidor_voidTovoid;
	}

	public Cap_ext_ op_Productor_voidTovoid;
	public Cap_ext_ JRget_op_Productor_voidTovoid() {
		return op_Productor_voidTovoid;
	}
	public void JRset_op_Productor_voidTovoid(Cap_ext_ op_Productor_voidTovoid) {
		this.op_Productor_voidTovoid = op_Productor_voidTovoid;
	}

	public Cap_ext_ op_pausa_intTovoid;
	public Cap_ext_ JRget_op_pausa_intTovoid() {
		return op_pausa_intTovoid;
	}
	public void JRset_op_pausa_intTovoid(Cap_ext_ op_pausa_intTovoid) {
		this.op_pausa_intTovoid = op_pausa_intTovoid;
	}

	public Cap_ext_ op_recuperado_voidTovoid;
	public Cap_ext_ JRget_op_recuperado_voidTovoid() {
		return op_recuperado_voidTovoid;
	}
	public void JRset_op_recuperado_voidTovoid(Cap_ext_ op_recuperado_voidTovoid) {
		this.op_recuperado_voidTovoid = op_recuperado_voidTovoid;
	}

	public Cap_ext_ op_depositado_voidTovoid;
	public Cap_ext_ JRget_op_depositado_voidTovoid() {
		return op_depositado_voidTovoid;
	}
	public void JRset_op_depositado_voidTovoid(Cap_ext_ op_depositado_voidTovoid) {
		this.op_depositado_voidTovoid = op_depositado_voidTovoid;
	}

	public JRProdConsuBufferSimple(JRProdConsuBufferSimple copy)
	{
	this.op_Consumidor_voidTovoid = copy.op_Consumidor_voidTovoid;
	this.op_Productor_voidTovoid = copy.op_Productor_voidTovoid;
	this.op_pausa_intTovoid = copy.op_pausa_intTovoid;
	this.op_recuperado_voidTovoid = copy.op_recuperado_voidTovoid;
	this.op_depositado_voidTovoid = copy.op_depositado_voidTovoid;

	}
	public JRProdConsuBufferSimple(Object ... opSig)
	{
	this.op_Consumidor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Productor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_pausa_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_recuperado_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_depositado_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRProdConsuBufferSimple(boolean dummy)	{
	    super(dummy);
	this.op_Consumidor_voidTovoid = Cap_ext_.noop;
	this.op_Productor_voidTovoid = Cap_ext_.noop;
	this.op_pausa_intTovoid = Cap_ext_.noop;
	this.op_recuperado_voidTovoid = Cap_ext_.noop;
	this.op_depositado_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRProdConsuBufferSimple(true);
	}
    }
