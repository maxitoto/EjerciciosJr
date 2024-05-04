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
	public Cap_ext_ op_p2_voidTovoid;
	public Cap_ext_ JRget_op_p2_voidTovoid() {
		return op_p2_voidTovoid;
	}
	public void JRset_op_p2_voidTovoid(Cap_ext_ op_p2_voidTovoid) {
		this.op_p2_voidTovoid = op_p2_voidTovoid;
	}

	public Cap_ext_ op_p1_voidTovoid;
	public Cap_ext_ JRget_op_p1_voidTovoid() {
		return op_p1_voidTovoid;
	}
	public void JRset_op_p1_voidTovoid(Cap_ext_ op_p1_voidTovoid) {
		this.op_p1_voidTovoid = op_p1_voidTovoid;
	}

	public Cap_ext_ op_espera_intTovoid;
	public Cap_ext_ JRget_op_espera_intTovoid() {
		return op_espera_intTovoid;
	}
	public void JRset_op_espera_intTovoid(Cap_ext_ op_espera_intTovoid) {
		this.op_espera_intTovoid = op_espera_intTovoid;
	}

	public Cap_ext_ op_s_voidTovoid;
	public Cap_ext_ JRget_op_s_voidTovoid() {
		return op_s_voidTovoid;
	}
	public void JRset_op_s_voidTovoid(Cap_ext_ op_s_voidTovoid) {
		this.op_s_voidTovoid = op_s_voidTovoid;
	}

	public Cap_ext_ op_w_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_w_javadotlangdotStringTovoid() {
		return op_w_javadotlangdotStringTovoid;
	}
	public void JRset_op_w_javadotlangdotStringTovoid(Cap_ext_ op_w_javadotlangdotStringTovoid) {
		this.op_w_javadotlangdotStringTovoid = op_w_javadotlangdotStringTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_p2_voidTovoid = copy.op_p2_voidTovoid;
	this.op_p1_voidTovoid = copy.op_p1_voidTovoid;
	this.op_espera_intTovoid = copy.op_espera_intTovoid;
	this.op_s_voidTovoid = copy.op_s_voidTovoid;
	this.op_w_javadotlangdotStringTovoid = copy.op_w_javadotlangdotStringTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_p2_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_p1_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_s_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_w_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_p2_voidTovoid = Cap_ext_.noop;
	this.op_p1_voidTovoid = Cap_ext_.noop;
	this.op_espera_intTovoid = Cap_ext_.noop;
	this.op_s_voidTovoid = Cap_ext_.noop;
	this.op_w_javadotlangdotStringTovoid = Cap_ext_.noop;

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
