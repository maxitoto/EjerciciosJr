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
	public Cap_ext_ op_auto_intTovoid;
	public Cap_ext_ JRget_op_auto_intTovoid() {
		return op_auto_intTovoid;
	}
	public void JRset_op_auto_intTovoid(Cap_ext_ op_auto_intTovoid) {
		this.op_auto_intTovoid = op_auto_intTovoid;
	}

	public Cap_ext_ op_espera_voidTovoid;
	public Cap_ext_ JRget_op_espera_voidTovoid() {
		return op_espera_voidTovoid;
	}
	public void JRset_op_espera_voidTovoid(Cap_ext_ op_espera_voidTovoid) {
		this.op_espera_voidTovoid = op_espera_voidTovoid;
	}

	public Cap_ext_ op_puerta_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_puerta_javadotlangdotStringTovoid() {
		return op_puerta_javadotlangdotStringTovoid;
	}
	public void JRset_op_puerta_javadotlangdotStringTovoid(Cap_ext_ op_puerta_javadotlangdotStringTovoid) {
		this.op_puerta_javadotlangdotStringTovoid = op_puerta_javadotlangdotStringTovoid;
	}

	public Cap_ext_ op_espacioDisponible_javadotlangdotStringTovoid;
	public Cap_ext_ JRget_op_espacioDisponible_javadotlangdotStringTovoid() {
		return op_espacioDisponible_javadotlangdotStringTovoid;
	}
	public void JRset_op_espacioDisponible_javadotlangdotStringTovoid(Cap_ext_ op_espacioDisponible_javadotlangdotStringTovoid) {
		this.op_espacioDisponible_javadotlangdotStringTovoid = op_espacioDisponible_javadotlangdotStringTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_auto_intTovoid = copy.op_auto_intTovoid;
	this.op_espera_voidTovoid = copy.op_espera_voidTovoid;
	this.op_puerta_javadotlangdotStringTovoid = copy.op_puerta_javadotlangdotStringTovoid;
	this.op_espacioDisponible_javadotlangdotStringTovoid = copy.op_espacioDisponible_javadotlangdotStringTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_auto_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_espera_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_puerta_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_espacioDisponible_javadotlangdotStringTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_auto_intTovoid = Cap_ext_.noop;
	this.op_espera_voidTovoid = Cap_ext_.noop;
	this.op_puerta_javadotlangdotStringTovoid = Cap_ext_.noop;
	this.op_espacioDisponible_javadotlangdotStringTovoid = Cap_ext_.noop;

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
