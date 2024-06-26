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
	public Cap_ext_ op_Consumer_voidTovoid;
	public Cap_ext_ JRget_op_Consumer_voidTovoid() {
		return op_Consumer_voidTovoid;
	}
	public void JRset_op_Consumer_voidTovoid(Cap_ext_ op_Consumer_voidTovoid) {
		this.op_Consumer_voidTovoid = op_Consumer_voidTovoid;
	}

	public Cap_ext_ op_Producer_voidTovoid;
	public Cap_ext_ JRget_op_Producer_voidTovoid() {
		return op_Producer_voidTovoid;
	}
	public void JRset_op_Producer_voidTovoid(Cap_ext_ op_Producer_voidTovoid) {
		this.op_Producer_voidTovoid = op_Producer_voidTovoid;
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
	this.op_Consumer_voidTovoid = copy.op_Consumer_voidTovoid;
	this.op_Producer_voidTovoid = copy.op_Producer_voidTovoid;
	this.op_puedoProducir_charTovoid = copy.op_puedoProducir_charTovoid;
	this.op_puedoConsumir_charTovoid = copy.op_puedoConsumir_charTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_Consumer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Producer_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_puedoProducir_charTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_puedoConsumir_charTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_Consumer_voidTovoid = Cap_ext_.noop;
	this.op_Producer_voidTovoid = Cap_ext_.noop;
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
