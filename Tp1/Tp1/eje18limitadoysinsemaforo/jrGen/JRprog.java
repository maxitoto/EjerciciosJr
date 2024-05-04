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

	public Cap_ext_ op_esperar_intTovoid;
	public Cap_ext_ JRget_op_esperar_intTovoid() {
		return op_esperar_intTovoid;
	}
	public void JRset_op_esperar_intTovoid(Cap_ext_ op_esperar_intTovoid) {
		this.op_esperar_intTovoid = op_esperar_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_productor_voidTovoid = copy.op_productor_voidTovoid;
	this.op_consumidor_voidTovoid = copy.op_consumidor_voidTovoid;
	this.op_esperar_intTovoid = copy.op_esperar_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_productor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_consumidor_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_esperar_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_productor_voidTovoid = Cap_ext_.noop;
	this.op_consumidor_voidTovoid = Cap_ext_.noop;
	this.op_esperar_intTovoid = Cap_ext_.noop;

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
