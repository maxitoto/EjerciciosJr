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
	public Cap_ext_ op_Consumer_intTovoid;
	public Cap_ext_ JRget_op_Consumer_intTovoid() {
		return op_Consumer_intTovoid;
	}
	public void JRset_op_Consumer_intTovoid(Cap_ext_ op_Consumer_intTovoid) {
		this.op_Consumer_intTovoid = op_Consumer_intTovoid;
	}

	public Cap_ext_ op_Producer_intTovoid;
	public Cap_ext_ JRget_op_Producer_intTovoid() {
		return op_Producer_intTovoid;
	}
	public void JRset_op_Producer_intTovoid(Cap_ext_ op_Producer_intTovoid) {
		this.op_Producer_intTovoid = op_Producer_intTovoid;
	}

	public Cap_ext_ op_puedoProducir_charTovoid;
	public Cap_ext_ JRget_op_puedoProducir_charTovoid() {
		return op_puedoProducir_charTovoid;
	}
	public void JRset_op_puedoProducir_charTovoid(Cap_ext_ op_puedoProducir_charTovoid) {
		this.op_puedoProducir_charTovoid = op_puedoProducir_charTovoid;
	}

	public Cap_ext_ op_puedoConsumir_charTovoid;
	public Cap_ext_ JRget_op_puedoConsumir_charTovoid() {
		return op_puedoConsumir_charTovoid;
	}
	public void JRset_op_puedoConsumir_charTovoid(Cap_ext_ op_puedoConsumir_charTovoid) {
		this.op_puedoConsumir_charTovoid = op_puedoConsumir_charTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_Consumer_intTovoid = copy.op_Consumer_intTovoid;
	this.op_Producer_intTovoid = copy.op_Producer_intTovoid;
	this.op_puedoProducir_charTovoid = copy.op_puedoProducir_charTovoid;
	this.op_puedoConsumir_charTovoid = copy.op_puedoConsumir_charTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_Consumer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Producer_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_puedoProducir_charTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_puedoConsumir_charTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_Consumer_intTovoid = Cap_ext_.noop;
	this.op_Producer_intTovoid = Cap_ext_.noop;
	this.op_puedoProducir_charTovoid = Cap_ext_.noop;
	this.op_puedoConsumir_charTovoid = Cap_ext_.noop;

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
