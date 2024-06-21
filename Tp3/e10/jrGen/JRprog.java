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
	public Cap_ext_ op_clientes_intTovoid;
	public Cap_ext_ JRget_op_clientes_intTovoid() {
		return op_clientes_intTovoid;
	}
	public void JRset_op_clientes_intTovoid(Cap_ext_ op_clientes_intTovoid) {
		this.op_clientes_intTovoid = op_clientes_intTovoid;
	}

	public Cap_ext_ op_barbero_intTovoid;
	public Cap_ext_ JRget_op_barbero_intTovoid() {
		return op_barbero_intTovoid;
	}
	public void JRset_op_barbero_intTovoid(Cap_ext_ op_barbero_intTovoid) {
		this.op_barbero_intTovoid = op_barbero_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_clientes_intTovoid = copy.op_clientes_intTovoid;
	this.op_barbero_intTovoid = copy.op_barbero_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_clientes_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_barbero_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_clientes_intTovoid = Cap_ext_.noop;
	this.op_barbero_intTovoid = Cap_ext_.noop;

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
