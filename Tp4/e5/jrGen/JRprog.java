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
	public Cap_ext_ op_proceos_intTovoid;
	public Cap_ext_ JRget_op_proceos_intTovoid() {
		return op_proceos_intTovoid;
	}
	public void JRset_op_proceos_intTovoid(Cap_ext_ op_proceos_intTovoid) {
		this.op_proceos_intTovoid = op_proceos_intTovoid;
	}

	public Cap_ext_ op_mutex_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_mutex_javadotlangdotStringTovoid() {
		return op_mutex_javadotlangdotStringTovoid;
	}
	public void JRset_op_mutex_javadotlangdotStringTovoid(Cap_ext_ op_mutex_javadotlangdotStringTovoid) {
		this.op_mutex_javadotlangdotStringTovoid = op_mutex_javadotlangdotStringTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_proceos_intTovoid = copy.op_proceos_intTovoid;
	this.op_mutex_javadotlangdotStringTovoid = copy.op_mutex_javadotlangdotStringTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_proceos_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_mutex_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_proceos_intTovoid = Cap_ext_.noop;
	this.op_mutex_javadotlangdotStringTovoid = Cap_ext_.noop;

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
