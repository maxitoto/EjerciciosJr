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
	public Cap_ext_ op_consumidores_intTovoid;
	public Cap_ext_ JRget_op_consumidores_intTovoid() {
		return op_consumidores_intTovoid;
	}
	public void JRset_op_consumidores_intTovoid(Cap_ext_ op_consumidores_intTovoid) {
		this.op_consumidores_intTovoid = op_consumidores_intTovoid;
	}

	public Cap_ext_ op_productores_intTovoid;
	public Cap_ext_ JRget_op_productores_intTovoid() {
		return op_productores_intTovoid;
	}
	public void JRset_op_productores_intTovoid(Cap_ext_ op_productores_intTovoid) {
		this.op_productores_intTovoid = op_productores_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_consumidores_intTovoid = copy.op_consumidores_intTovoid;
	this.op_productores_intTovoid = copy.op_productores_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_consumidores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_productores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_consumidores_intTovoid = Cap_ext_.noop;
	this.op_productores_intTovoid = Cap_ext_.noop;

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
