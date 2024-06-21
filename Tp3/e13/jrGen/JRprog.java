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
	public Cap_ext_ op_pocesos_intTovoid;
	public Cap_ext_ JRget_op_pocesos_intTovoid() {
		return op_pocesos_intTovoid;
	}
	public void JRset_op_pocesos_intTovoid(Cap_ext_ op_pocesos_intTovoid) {
		this.op_pocesos_intTovoid = op_pocesos_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_pocesos_intTovoid = copy.op_pocesos_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_pocesos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_pocesos_intTovoid = Cap_ext_.noop;

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
