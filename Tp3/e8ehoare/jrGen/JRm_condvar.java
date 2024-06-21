/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRm_condvar
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_start_voidTovoid;
	public Cap_ext_ JRget_op_start_voidTovoid() {
		return op_start_voidTovoid;
	}
	public void JRset_op_start_voidTovoid(Cap_ext_ op_start_voidTovoid) {
		this.op_start_voidTovoid = op_start_voidTovoid;
	}

	public Cap_ext_ op_m_print_voidTovoid;
	public Cap_ext_ JRget_op_m_print_voidTovoid() {
		return op_m_print_voidTovoid;
	}
	public void JRset_op_m_print_voidTovoid(Cap_ext_ op_m_print_voidTovoid) {
		this.op_m_print_voidTovoid = op_m_print_voidTovoid;
	}

	public Cap_ext_ op_m_minrank_voidToint;
	public Cap_ext_ JRget_op_m_minrank_voidToint() {
		return op_m_minrank_voidToint;
	}
	public void JRset_op_m_minrank_voidToint(Cap_ext_ op_m_minrank_voidToint) {
		this.op_m_minrank_voidToint = op_m_minrank_voidToint;
	}

	public Cap_ext_ op_m_empty_voidToboolean;
	public Cap_ext_ JRget_op_m_empty_voidToboolean() {
		return op_m_empty_voidToboolean;
	}
	public void JRset_op_m_empty_voidToboolean(Cap_ext_ op_m_empty_voidToboolean) {
		this.op_m_empty_voidToboolean = op_m_empty_voidToboolean;
	}

	public Cap_ext_ op_m_signal_all_voidTovoid;
	public Cap_ext_ JRget_op_m_signal_all_voidTovoid() {
		return op_m_signal_all_voidTovoid;
	}
	public void JRset_op_m_signal_all_voidTovoid(Cap_ext_ op_m_signal_all_voidTovoid) {
		this.op_m_signal_all_voidTovoid = op_m_signal_all_voidTovoid;
	}

	public Cap_ext_ op_m_signal_voidToboolean;
	public Cap_ext_ JRget_op_m_signal_voidToboolean() {
		return op_m_signal_voidToboolean;
	}
	public void JRset_op_m_signal_voidToboolean(Cap_ext_ op_m_signal_voidToboolean) {
		this.op_m_signal_voidToboolean = op_m_signal_voidToboolean;
	}

	public Cap_ext_ op_m_wait_ranks_intTovoid;
	public Cap_ext_ JRget_op_m_wait_ranks_intTovoid() {
		return op_m_wait_ranks_intTovoid;
	}
	public void JRset_op_m_wait_ranks_intTovoid(Cap_ext_ op_m_wait_ranks_intTovoid) {
		this.op_m_wait_ranks_intTovoid = op_m_wait_ranks_intTovoid;
	}

	public Cap_ext_ op_m_wait_Cap_voidTovoidXintTovoid;
	public Cap_ext_ JRget_op_m_wait_Cap_voidTovoidXintTovoid() {
		return op_m_wait_Cap_voidTovoidXintTovoid;
	}
	public void JRset_op_m_wait_Cap_voidTovoidXintTovoid(Cap_ext_ op_m_wait_Cap_voidTovoidXintTovoid) {
		this.op_m_wait_Cap_voidTovoidXintTovoid = op_m_wait_Cap_voidTovoidXintTovoid;
	}

	public JRm_condvar(JRm_condvar copy)
	{
	this.op_start_voidTovoid = copy.op_start_voidTovoid;
	this.op_m_print_voidTovoid = copy.op_m_print_voidTovoid;
	this.op_m_minrank_voidToint = copy.op_m_minrank_voidToint;
	this.op_m_empty_voidToboolean = copy.op_m_empty_voidToboolean;
	this.op_m_signal_all_voidTovoid = copy.op_m_signal_all_voidTovoid;
	this.op_m_signal_voidToboolean = copy.op_m_signal_voidToboolean;
	this.op_m_wait_ranks_intTovoid = copy.op_m_wait_ranks_intTovoid;
	this.op_m_wait_Cap_voidTovoidXintTovoid = copy.op_m_wait_Cap_voidTovoidXintTovoid;

	}
	public JRm_condvar(Object ... opSig)
	{
	this.op_start_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_m_print_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_m_minrank_voidToint = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_m_empty_voidToboolean = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_m_signal_all_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_m_signal_voidToboolean = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_m_wait_ranks_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);
	this.op_m_wait_Cap_voidTovoidXintTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[7]);

	}
	public JRm_condvar(boolean dummy)	{
	    super(dummy);
	this.op_start_voidTovoid = Cap_ext_.noop;
	this.op_m_print_voidTovoid = Cap_ext_.noop;
	this.op_m_minrank_voidToint = Cap_ext_.noop;
	this.op_m_empty_voidToboolean = Cap_ext_.noop;
	this.op_m_signal_all_voidTovoid = Cap_ext_.noop;
	this.op_m_signal_voidToboolean = Cap_ext_.noop;
	this.op_m_wait_ranks_intTovoid = Cap_ext_.noop;
	this.op_m_wait_Cap_voidTovoidXintTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRm_condvar(true);
	}
    }
