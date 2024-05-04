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
	public Cap_ext_ op_productor_voidTovoid;
	public Cap_ext_ JRget_op_productor_voidTovoid() {
		return op_productor_voidTovoid;
	}
	public void JRset_op_productor_voidTovoid(Cap_ext_ op_productor_voidTovoid) {
		this.op_productor_voidTovoid = op_productor_voidTovoid;
	}

	public Cap_ext_ op_consumidor_voidTovoid;
	public Cap_ext_ JRget_op_consumidor_voidTovoid() {
		return op_consumidor_voidTovoid;
	}
	public void JRset_op_consumidor_voidTovoid(Cap_ext_ op_consumidor_voidTovoid) {
		this.op_consumidor_voidTovoid = op_consumidor_voidTovoid;
	}

	public Cap_ext_ op_espera_intXintTovoid;
	public Cap_ext_ JRget_op_espera_intXintTovoid() {
		return op_espera_intXintTovoid;
	}
	public void JRset_op_espera_intXintTovoid(Cap_ext_ op_espera_intXintTovoid) {
		this.op_espera_intXintTovoid = op_espera_intXintTovoid;
	}

	public Cap_ext_ op_llenos_voidTovoid;
	public Cap_ext_ JRget_op_llenos_voidTovoid() {
		return op_llenos_voidTovoid;
	}
	public void JRset_op_llenos_voidTovoid(Cap_ext_ op_llenos_voidTovoid) {
		this.op_llenos_voidTovoid = op_llenos_voidTovoid;
	}

	public Cap_ext_ op_vacios_voidTovoid;
	public Cap_ext_ JRget_op_vacios_voidTovoid() {
		return op_vacios_voidTovoid;
	}
	public void JRset_op_vacios_voidTovoid(Cap_ext_ op_vacios_voidTovoid) {
		this.op_vacios_voidTovoid = op_vacios_voidTovoid;
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
	this.op_productor_voidTovoid = copy.op_productor_voidTovoid;
	this.op_consumidor_voidTovoid = copy.op_consumidor_voidTovoid;
	this.op_espera_intXintTovoid = copy.op_espera_intXintTovoid;
	this.op_llenos_voidTovoid = copy.op_llenos_voidTovoid;
	this.op_vacios_voidTovoid = copy.op_vacios_voidTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_productor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_consumidor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intXintTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_llenos_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_vacios_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_productor_voidTovoid = Cap_ext_.noop;
	this.op_consumidor_voidTovoid = Cap_ext_.noop;
	this.op_espera_intXintTovoid = Cap_ext_.noop;
	this.op_llenos_voidTovoid = Cap_ext_.noop;
	this.op_vacios_voidTovoid = Cap_ext_.noop;
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
