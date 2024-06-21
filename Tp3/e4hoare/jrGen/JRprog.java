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
	public Cap_ext_ op_lectrores_intTovoid;
	public Cap_ext_ JRget_op_lectrores_intTovoid() {
		return op_lectrores_intTovoid;
	}
	public void JRset_op_lectrores_intTovoid(Cap_ext_ op_lectrores_intTovoid) {
		this.op_lectrores_intTovoid = op_lectrores_intTovoid;
	}

	public Cap_ext_ op_escritores_intTovoid;
	public Cap_ext_ JRget_op_escritores_intTovoid() {
		return op_escritores_intTovoid;
	}
	public void JRset_op_escritores_intTovoid(Cap_ext_ op_escritores_intTovoid) {
		this.op_escritores_intTovoid = op_escritores_intTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_lectrores_intTovoid = copy.op_lectrores_intTovoid;
	this.op_escritores_intTovoid = copy.op_escritores_intTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_lectrores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_escritores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_lectrores_intTovoid = Cap_ext_.noop;
	this.op_escritores_intTovoid = Cap_ext_.noop;

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
