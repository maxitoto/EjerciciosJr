/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


public class m_condvar extends java.lang.Object {
    { JRinit(); }
    public Op_ext.JRProxyOp JRget_op_m_wait_Cap_voidTovoidXintTovoid()
    {
        return op_m_wait_Cap_voidTovoidXintTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_wait_Cap_voidTovoidXintTovoid;
    
    public Op_ext.JRProxyOp JRget_op_m_wait_ranks_intTovoid()
    {
        return op_m_wait_ranks_intTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_wait_ranks_intTovoid;
    
    public Op_ext.JRProxyOp JRget_op_m_signal_voidToboolean()
    {
        return op_m_signal_voidToboolean;
    }
    
    public Op_ext.JRProxyOp op_m_signal_voidToboolean;
    
    public Op_ext.JRProxyOp JRget_op_m_signal_all_voidTovoid()
    {
        return op_m_signal_all_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_signal_all_voidTovoid;
    
    public Op_ext.JRProxyOp JRget_op_m_empty_voidToboolean()
    {
        return op_m_empty_voidToboolean;
    }
    
    public Op_ext.JRProxyOp op_m_empty_voidToboolean;
    
    public Op_ext.JRProxyOp JRget_op_m_minrank_voidToint()
    {
        return op_m_minrank_voidToint;
    }
    
    public Op_ext.JRProxyOp op_m_minrank_voidToint;
    
    public Op_ext.JRProxyOp JRget_op_m_print_voidTovoid()
    {
        return op_m_print_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_print_voidTovoid;
    
    private String name;
    private Op_ext.JRProxyOp JRget_op_start_voidTovoid()
    {
        return op_start_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_start_voidTovoid;
    class ProcOp_voidTovoid_implstart extends ProcOp_ext_impl
    {
        m_condvar thisarg;
        public ProcOp_voidTovoid_implstart(m_condvar thisIn) throws RemoteException
        {
        thisarg = thisIn;
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                thisarg.startvoidTovoid(null, null, null, JRargs);
return null;
            } finally {
                jrvm.sendAndDie();    // to caller
            }
        }
        class sendThread implements Runnable
        {
            java.lang.Object [] JRargs;
            Op_ext.JRProxyOp retOp;
            Cap_ext fretOp;
            edu.ucdavis.jr.RemoteHandler handler;

            public sendThread(Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.handler = handler;
            }
            public sendThread(Op_ext.JRProxyOp retOp, Cap_ext fretOp,edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
            {
                this.JRargs = JRargs;
                this.retOp = retOp;
                this.fretOp = fretOp;
                this.handler = handler;
            }
            public void run()
            {
                try    {
                    thisarg.startvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
                } catch (Exception e) {/* should be safe to ignore this exception */}
                jrvm.threadDeath();
            }
        }
        public void send(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, null, null, JRargs);
        }
        public void send(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            this.send(JRtimestamp, null, handler, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, null, null, JRargs);
        }
        public Cap_ext cosend(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs) throws RemoteException
        {
            return this.cosend(JRtimestamp, null, handler, null, JRargs);
        }
        public void send(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, handler, JRargs)).start();
        }
        public Cap_ext cosend(long JRtimestamp, Op_ext.JRProxyOp retOp, edu.ucdavis.jr.RemoteHandler handler, Exception thrown, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(null, handler, JRargs)).start();
            Op_ext.JRProxyOp myretOp = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            myretOp.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            return new Cap_ext_(myretOp, "void");
        }
        public Cap_ext cocall(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, null, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Cap_ext cocall(long JRtimestamp, edu.ucdavis.jr.RemoteHandler handler, Cap_ext fretOp, java.lang.Object [] JRargs) throws RemoteException
        {
            Op_ext.JRProxyOp retOp = new Op_ext_.JRProxyOp(new InOp_ext_impl(false));
            jrvm.setTimestamp(JRtimestamp);
            jrvm.threadBirth();
            new Thread(new sendThread(retOp, fretOp, handler, JRargs)).start();
            Cap_ext retCap = new Cap_ext_(retOp, "void");
            return retCap;
        }
        public Recv_ext recv() throws RemoteException
        {
            /* This is an error */
            throw new jrRuntimeError("Receive invoked on an operation/operation capability associated with a method!");
        }
        public void deliverPendingMessages()
        {
            /* This is an error */
            throw new jrRuntimeError("Message delivery invoked on an operation associated with a method!");
        }
        public int length()
        {
            return 0;
        }
        public InOpIterator elements()
        {
            // This is an error
            throw new jrRuntimeError("Elements invoked on an operation / operation capability associated with a method!");
        }
        public InLock getLock()
        {
            // This is an error
            throw new jrRuntimeError("getLock invoked on an operation / operation capability associated with a method!");
        }
        public long getFirstTime()
        {
            // This is an error
            throw new jrRuntimeError("getFirstTime invoked on an operation / operation capability associated with a method!");
        }
        public boolean isRemote(String site)
        {
            // This is an error
            throw new jrRuntimeError("IsRemote invoked on an operation / operation capability associated with a method!");
        }
    }
    
    
    public m_condvar(String name) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.name = name;
        JRget_op_start_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
        JRprocess();
    }
    
    private void startvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_start_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private void startvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                InStatObj JRInstmt6 = new InStatObj(7, false);
                InStatObj JRInstmt5 = new InStatObj(1, false);
                InStatObj JRInstmt4 = new InStatObj(1, false);
                InStatObj JRInstmt3 = new InStatObj(1, false);
                InStatObj JRInstmt2 = new InStatObj(1, false);
                InStatObj JRInstmt1 = new InStatObj(1, false);
                InStatObj JRInstmt0 = new InStatObj(1, false);
                JRLoop3: while (true) {
                    {
                        // Inni Statement without quantifier
                        JRInstmt6.armArray[0] = new QuantRec(new Cap_ext_(op_m_wait_Cap_voidTovoidXintTovoid, "void"), 0, 0);
                        JRInstmt6.armArray[1] = new QuantRec(new Cap_ext_(op_m_signal_voidToboolean, "boolean"), 1, 1);
                        JRInstmt6.armArray[2] = new QuantRec(new Cap_ext_(op_m_wait_Cap_voidTovoidXintTovoid, "void"), 2, 2);
                        JRInstmt6.armArray[3] = new QuantRec(new Cap_ext_(op_m_signal_all_voidTovoid, "void"), 3, 3);
                        JRInstmt6.armArray[4] = new QuantRec(new Cap_ext_(op_m_empty_voidToboolean, "boolean"), 4, 4);
                        JRInstmt6.armArray[5] = new QuantRec(new Cap_ext_(op_m_minrank_voidToint, "int"), 5, 5);
                        JRInstmt6.armArray[6] = new QuantRec(new Cap_ext_(op_m_print_voidTovoid, "void"), 6, 6);
                        JRInstmt6.lock();
                        // Equivalence Class has been created and locked
                        JRInstmt6.serviced = false;
                        _label_JRInstmt6: do
                        {
                            Invocation JRfinalInvoc6 = null;
                            // find THE invocation and service it
                            JRInstmt6.gatherAndSortTimes();
                            for (JRInstmt6.i = 0;
                                (JRInstmt6.i < JRInstmt6.N) && !JRInstmt6.serviced;
                                 JRInstmt6.i++)
                            {
                                JRInstmt6.byStrt = true;
                                JRInstmt6.releaseIter();
                                // if the op is empty
                                if (JRInstmt6.timesArray[JRInstmt6.i].time < 0) continue;
                                switch (JRInstmt6.timesArray[JRInstmt6.i].opNum)
                                {
                                    case 0:
                                    {
                                        JRInstmt6.j = 0;
                                        // Inni Arm
                                        int JRbyVal6 = 0; /* init to hush javac */
                                        int JRcurVal6 = 0; /* init to hush javac */
                                        QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                        Recv_ext JRrrecv6 = null, JRtmprecv6;
                                        // not artificial
                                        // NUMBER 3
                                        Cap_ext_ return_to_caller = null;
                                        // not artificial
                                        int rank = 0;
                                        for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                             JRInstmt6.iter.hasNext();)
                                        {
                                            JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                            JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                            JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                            // extract values
                                            return_to_caller = (// not artificial
                                            // NUMBER 3
                                            Cap_ext_)JRtmprecv6.JRargs[0];
                                            // GetMethod 2
                                            rank = ((Number) JRtmprecv6.JRargs[1]).intValue();
                                            ;
                                            if (JRget_op_m_signal_voidToboolean().length() != 0)
                                            {
                                                JRcurVal6 = rank;
                                                if (JRInstmt6.byStrt || (JRcurVal6 < JRbyVal6)){
                                                    JRInstmt6.byStrt = false;
                                                    JRbyVal6  = JRcurVal6;
                                                    JRInstmt6.curInvoc = JRInstmt6.iter.getCurInvoc();
                                                    JRrrecv6 = JRtmprecv6;
                                                }
                                            }
                                        }
                                        // Start of servicing
                                        if (JRrrecv6 != null)
                                        {
                                            JRInstmt6.serviced = true;
                                            JRInstmt6.iter.remove(JRInstmt6.curInvoc);
                                            return_to_caller = (// NUMBER 4
                                            Cap_ext_)JRrrecv6.JRargs[0];
                                            // GetMethod 4
                                            rank = ((Number) JRrrecv6.JRargs[1]).intValue();
                                            JRInstmt6.releaseIter();
                                            JRInstmt6.unlock();
                                            {
                                                try {
                                                    {
                                                        {
                                                            // Inni Statement without quantifier
                                                            JRInstmt0.armArray[0] = new QuantRec(new Cap_ext_(op_m_wait_ranks_intTovoid, "void"), 0, 0);
                                                            JRInstmt0.lock();
                                                            // Equivalence Class has been created and locked
                                                            JRInstmt0.serviced = false;
                                                            _label_JRInstmt0: do
                                                            {
                                                                Invocation JRfinalInvoc0 = null;
                                                                // find THE invocation and service it
                                                                JRInstmt0.gatherAndSortTimes();
                                                                for (JRInstmt0.i = 0;
                                                                    (JRInstmt0.i < JRInstmt0.N) && !JRInstmt0.serviced;
                                                                     JRInstmt0.i++)
                                                                {
                                                                    JRInstmt0.byStrt = true;
                                                                    JRInstmt0.releaseIter();
                                                                    // if the op is empty
                                                                    if (JRInstmt0.timesArray[JRInstmt0.i].time < 0) continue;
                                                                    switch (JRInstmt0.timesArray[JRInstmt0.i].opNum)
                                                                    {
                                                                        case 0:
                                                                        {
                                                                            JRInstmt0.j = 0;
                                                                            // Inni Arm
                                                                            int JRbyVal0 = 0; /* init to hush javac */
                                                                            int JRcurVal0 = 0; /* init to hush javac */
                                                                            QuantRec JRquantRec0 = (QuantRec)JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex];
                                                                            Recv_ext JRrrecv0 = null, JRtmprecv0;
                                                                            // not artificial
                                                                            int rrank = 0;
                                                                            for (JRInstmt0.iter = JRInstmt0.armArray[JRInstmt0.timesArray[JRInstmt0.i].armArrayIndex].theCap.elements();
                                                                                 JRInstmt0.iter.hasNext();)
                                                                            {
                                                                                JRtmprecv0 = (Recv_ext)JRInstmt0.iter.next();
                                                                                JRInstmt0.JRinit.setInvoc(JRInstmt0.j++);
                                                                                JRtmprecv0.setInvocation(JRInstmt0.JRinit);
                                                                                // extract values
                                                                                // GetMethod 2
                                                                                rrank = ((Number) JRtmprecv0.JRargs[0]).intValue();
                                                                                ;
                                                                                JRcurVal0 = rrank;
                                                                                if (JRInstmt0.byStrt || (JRcurVal0 < JRbyVal0)){
                                                                                    JRInstmt0.byStrt = false;
                                                                                    JRbyVal0  = JRcurVal0;
                                                                                    JRInstmt0.curInvoc = JRInstmt0.iter.getCurInvoc();
                                                                                    JRrrecv0 = JRtmprecv0;
                                                                                }
                                                                                                                                                    }
                                                                        // Start of servicing
                                                                        if (JRrrecv0 != null)
                                                                        {
                                                                            JRInstmt0.serviced = true;
                                                                            JRInstmt0.iter.remove(JRInstmt0.curInvoc);
                                                                            // GetMethod 4
                                                                            rrank = ((Number) JRrrecv0.JRargs[0]).intValue();
                                                                            JRInstmt0.releaseIter();
                                                                            JRInstmt0.unlock();
                                                                            {
                                                                                try {
                                                                                    {
                                                                                    }
                                                                                } catch (Exception JRe) {
                                                                                    if (JRrrecv0.retOp != null && JRrrecv0.fretOp == null)
                                                                                    {
                                                                                        // forward of cocall
                                                                                        if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                            JRrrecv0.handler.JRhandler(JRe);
                                                                                        else {
                                                                                            // give preference to propagation through the call stack
                                                                                            JRrrecv0.retOp.send(jrvm.getTimestamp(), JRe);
                                                                                            JRrrecv0.retOp = null;
                                                                                        }
                                                                                    }
                                                                                    else if ((JRrrecv0.retOp != null) && (JRrrecv0.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // for cocall exception handling in operation invocation
                                                                                        if (JRrrecv0.handler != null)
                                                                                            JRrrecv0.handler.JRhandler(JRe);
                                                                                            else {
                                                                                                // catch all
                                                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                            }
JRrrecv0.fretOp.send(jrvm.getTimestamp(), JRrrecv0.handler, (java.lang.Object []) null);
                                                                                        JRrrecv0.fretOp = null;
                                                                                    }
                                                                                    else if ((JRrrecv0.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // this should only be a send
                                                                                        JRrrecv0.handler.JRhandler(JRe);
                                                                                    }
    else {
                                                                                            // catch all
                                                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                        }
                                                                                }
                                                                            }
                                                                            { if (JRrrecv0.retOp != null)
                                                                                JRrrecv0.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                                                        }
                                                                        else
                                                                            JRInstmt0.releaseIter();
                                                                        // End of servicing
                                                                        // End InniArm
                                                                        break;
                                                                    }
                                                                    
                                                                }
                                                            }
                                                            if (!JRInstmt0.serviced)
                                                            {
                                                                // must block and loop
                                                                JRInstmt0.waitOnLock();
                                                            }
                                                        } while (!JRInstmt0.serviced);
                                                    }
                                                    // End Inni
                                                    
                                                    {
                                                        // Inni Statement without quantifier
                                                        JRInstmt1.armArray[0] = new QuantRec(new Cap_ext_(op_m_signal_voidToboolean, "boolean"), 0, 0);
                                                        JRInstmt1.lock();
                                                        // Equivalence Class has been created and locked
                                                        JRInstmt1.serviced = false;
                                                        _label_JRInstmt1: do
                                                        {
                                                            Invocation JRfinalInvoc1 = null;
                                                            // find THE invocation and service it
                                                            JRInstmt1.gatherAndSortTimes();
                                                            for (JRInstmt1.i = 0;
                                                                (JRInstmt1.i < JRInstmt1.N) && !JRInstmt1.serviced;
                                                                 JRInstmt1.i++)
                                                            {
                                                                JRInstmt1.byStrt = true;
                                                                JRInstmt1.releaseIter();
                                                                // if the op is empty
                                                                if (JRInstmt1.timesArray[JRInstmt1.i].time < 0) continue;
                                                                switch (JRInstmt1.timesArray[JRInstmt1.i].opNum)
                                                                {
                                                                    case 0:
                                                                    {
                                                                        JRInstmt1.j = 0;
                                                                        // Inni Arm
                                                                        QuantRec JRquantRec1 = (QuantRec)JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex];
                                                                        Recv_ext JRrrecv1 = null, JRtmprecv1;
                                                                        for (JRInstmt1.iter = JRInstmt1.armArray[JRInstmt1.timesArray[JRInstmt1.i].armArrayIndex].theCap.elements();
                                                                             JRInstmt1.iter.hasNext();)
                                                                        {
                                                                            JRtmprecv1 = (Recv_ext)JRInstmt1.iter.next();
                                                                            JRInstmt1.JRinit.setInvoc(JRInstmt1.j++);
                                                                            JRtmprecv1.setInvocation(JRInstmt1.JRinit);
                                                                            // extract values
                                                                            JRrrecv1 = JRtmprecv1;
                                                                            break;  // get first one
                                                                        }
                                                                        // Start of servicing
                                                                        if (JRrrecv1 != null)
                                                                        {
                                                                            JRInstmt1.j = (int)JRrrecv1.getInvoc();
                                                                            JRInstmt1.serviced = true;
                                                                            JRInstmt1.iter.remove(JRInstmt1.j);
                                                                            JRInstmt1.releaseIter();
                                                                            JRInstmt1.unlock();
                                                                            {
                                                                                try {
                                                                                    {
                                                                                        // Return
                                                                                        {
                                                                                            if (true)
                                                                                                { if (JRrrecv1.retOp != null)
                                                                                                    JRrrecv1.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(true)});
                                                                                                else {
                                                                                                    boolean JRevaltmp = true;
                                                                                                    
                                                                                                }
                                                                                                break _label_JRInstmt1; }}
                                                                                        
                                                                                        // End Return

                                                                                    }
                                                                                } catch (Exception JRe) {
                                                                                    if (JRrrecv1.retOp != null && JRrrecv1.fretOp == null)
                                                                                    {
                                                                                        // forward of cocall
                                                                                        if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                            JRrrecv1.handler.JRhandler(JRe);
                                                                                        else {
                                                                                            // give preference to propagation through the call stack
                                                                                            JRrrecv1.retOp.send(jrvm.getTimestamp(), JRe);
                                                                                            JRrrecv1.retOp = null;
                                                                                        }
                                                                                    }
                                                                                    else if ((JRrrecv1.retOp != null) && (JRrrecv1.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // for cocall exception handling in operation invocation
                                                                                        if (JRrrecv1.handler != null)
                                                                                            JRrrecv1.handler.JRhandler(JRe);
                                                                                            else {
                                                                                                // catch all
                                                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                            }
JRrrecv1.fretOp.send(jrvm.getTimestamp(), JRrrecv1.handler, (java.lang.Object []) null);
                                                                                        JRrrecv1.fretOp = null;
                                                                                    }
                                                                                    else if ((JRrrecv1.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // this should only be a send
                                                                                        JRrrecv1.handler.JRhandler(JRe);
                                                                                    }
    else {
                                                                                            // catch all
                                                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                        }
                                                                                }
                                                                            }
                                                                            
                                                                        }
                                                                        else
                                                                            JRInstmt1.releaseIter();
                                                                        // End of servicing
                                                                        // End InniArm
                                                                        break;
                                                                    }
                                                                    
                                                                }
                                                            }
                                                            if (!JRInstmt1.serviced)
                                                            {
                                                                // must block and loop
                                                                JRInstmt1.waitOnLock();
                                                            }
                                                        } while (!JRInstmt1.serviced);
                                                    }
                                                    // End Inni
                                                    
                                                    return_to_caller.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                                }
                                            } catch (Exception JRe) {
                                                if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                                {
                                                    // forward of cocall
                                                    if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                        JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // give preference to propagation through the call stack
                                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                        JRrrecv6.retOp = null;
                                                    }
                                                }
                                                else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                {
                                                    // for cocall exception handling in operation invocation
                                                    if (JRrrecv6.handler != null)
                                                        JRrrecv6.handler.JRhandler(JRe);
                                                        else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                    JRrrecv6.fretOp = null;
                                                }
                                                else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                {
                                                    // this should only be a send
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                }
    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
                                            }
                                        }
                                        { if (JRrrecv6.retOp != null)
                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                    }
                                    else
                                        JRInstmt6.releaseIter();
                                    // End of servicing
                                    // End InniArm
                                    break;
                                }
                                case 1:
                                {
                                    JRInstmt6.j = 0;
                                    // Inni Arm
                                    QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                    Recv_ext JRrrecv6 = null, JRtmprecv6;
                                    for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                         JRInstmt6.iter.hasNext();)
                                    {
                                        JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                        JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                        JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                        // extract values
                                        if (JRget_op_m_wait_Cap_voidTovoidXintTovoid().length() == 0)
                                            JRrrecv6 = JRtmprecv6;
                                        if (JRrrecv6 != null)
                                            break;  // get first one
                                    }
                                    // Start of servicing
                                    if (JRrrecv6 != null)
                                    {
                                        JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                        JRInstmt6.serviced = true;
                                        JRInstmt6.iter.remove(JRInstmt6.j);
                                        JRInstmt6.releaseIter();
                                        JRInstmt6.unlock();
                                        {
                                            try {
                                                {
                                                    // Return
                                                    {
                                                        if (true)
                                                            { if (JRrrecv6.retOp != null)
                                                                JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(false)});
                                                            else {
                                                                boolean JRevaltmp = false;
                                                                
                                                            }
                                                            break _label_JRInstmt6; }}
                                                    
                                                    // End Return

                                                }
                                            } catch (Exception JRe) {
                                                if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                                {
                                                    // forward of cocall
                                                    if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                        JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // give preference to propagation through the call stack
                                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                        JRrrecv6.retOp = null;
                                                    }
                                                }
                                                else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                {
                                                    // for cocall exception handling in operation invocation
                                                    if (JRrrecv6.handler != null)
                                                        JRrrecv6.handler.JRhandler(JRe);
                                                        else {
                                                            // catch all
                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                        }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                    JRrrecv6.fretOp = null;
                                                }
                                                else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                {
                                                    // this should only be a send
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                }
    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
                                            }
                                        }
                                        
                                    }
                                    else
                                        JRInstmt6.releaseIter();
                                    // End of servicing
                                    // End InniArm
                                    break;
                                }
                                case 2:
                                {
                                    JRInstmt6.j = 0;
                                    // Inni Arm
                                    int JRbyVal6 = 0; /* init to hush javac */
                                    int JRcurVal6 = 0; /* init to hush javac */
                                    QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                    Recv_ext JRrrecv6 = null, JRtmprecv6;
                                    // not artificial
                                    // NUMBER 3
                                    Cap_ext_ return_to_caller = null;
                                    // not artificial
                                    int rank = 0;
                                    for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                         JRInstmt6.iter.hasNext();)
                                    {
                                        JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                        JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                        JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                        // extract values
                                        return_to_caller = (// not artificial
                                        // NUMBER 3
                                        Cap_ext_)JRtmprecv6.JRargs[0];
                                        // GetMethod 2
                                        rank = ((Number) JRtmprecv6.JRargs[1]).intValue();
                                        ;
                                        if (JRget_op_m_signal_all_voidTovoid().length() != 0)
                                        {
                                            JRcurVal6 = rank;
                                            if (JRInstmt6.byStrt || (JRcurVal6 < JRbyVal6)){
                                                JRInstmt6.byStrt = false;
                                                JRbyVal6  = JRcurVal6;
                                                JRInstmt6.curInvoc = JRInstmt6.iter.getCurInvoc();
                                                JRrrecv6 = JRtmprecv6;
                                            }
                                        }
                                    }
                                    // Start of servicing
                                    if (JRrrecv6 != null)
                                    {
                                        JRInstmt6.serviced = true;
                                        JRInstmt6.iter.remove(JRInstmt6.curInvoc);
                                        return_to_caller = (// NUMBER 4
                                        Cap_ext_)JRrrecv6.JRargs[0];
                                        // GetMethod 4
                                        rank = ((Number) JRrrecv6.JRargs[1]).intValue();
                                        JRInstmt6.releaseIter();
                                        JRInstmt6.unlock();
                                        {
                                            try {
                                                {
                                                    {
                                                        // Inni Statement without quantifier
                                                        JRInstmt2.armArray[0] = new QuantRec(new Cap_ext_(op_m_wait_ranks_intTovoid, "void"), 0, 0);
                                                        JRInstmt2.lock();
                                                        // Equivalence Class has been created and locked
                                                        JRInstmt2.serviced = false;
                                                        _label_JRInstmt2: do
                                                        {
                                                            Invocation JRfinalInvoc2 = null;
                                                            // find THE invocation and service it
                                                            JRInstmt2.gatherAndSortTimes();
                                                            for (JRInstmt2.i = 0;
                                                                (JRInstmt2.i < JRInstmt2.N) && !JRInstmt2.serviced;
                                                                 JRInstmt2.i++)
                                                            {
                                                                JRInstmt2.byStrt = true;
                                                                JRInstmt2.releaseIter();
                                                                // if the op is empty
                                                                if (JRInstmt2.timesArray[JRInstmt2.i].time < 0) continue;
                                                                switch (JRInstmt2.timesArray[JRInstmt2.i].opNum)
                                                                {
                                                                    case 0:
                                                                    {
                                                                        JRInstmt2.j = 0;
                                                                        // Inni Arm
                                                                        int JRbyVal2 = 0; /* init to hush javac */
                                                                        int JRcurVal2 = 0; /* init to hush javac */
                                                                        QuantRec JRquantRec2 = (QuantRec)JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex];
                                                                        Recv_ext JRrrecv2 = null, JRtmprecv2;
                                                                        // not artificial
                                                                        int rrank = 0;
                                                                        for (JRInstmt2.iter = JRInstmt2.armArray[JRInstmt2.timesArray[JRInstmt2.i].armArrayIndex].theCap.elements();
                                                                             JRInstmt2.iter.hasNext();)
                                                                        {
                                                                            JRtmprecv2 = (Recv_ext)JRInstmt2.iter.next();
                                                                            JRInstmt2.JRinit.setInvoc(JRInstmt2.j++);
                                                                            JRtmprecv2.setInvocation(JRInstmt2.JRinit);
                                                                            // extract values
                                                                            // GetMethod 2
                                                                            rrank = ((Number) JRtmprecv2.JRargs[0]).intValue();
                                                                            ;
                                                                            JRcurVal2 = rrank;
                                                                            if (JRInstmt2.byStrt || (JRcurVal2 < JRbyVal2)){
                                                                                JRInstmt2.byStrt = false;
                                                                                JRbyVal2  = JRcurVal2;
                                                                                JRInstmt2.curInvoc = JRInstmt2.iter.getCurInvoc();
                                                                                JRrrecv2 = JRtmprecv2;
                                                                            }
                                                                                                                                            }
                                                                    // Start of servicing
                                                                    if (JRrrecv2 != null)
                                                                    {
                                                                        JRInstmt2.serviced = true;
                                                                        JRInstmt2.iter.remove(JRInstmt2.curInvoc);
                                                                        // GetMethod 4
                                                                        rrank = ((Number) JRrrecv2.JRargs[0]).intValue();
                                                                        JRInstmt2.releaseIter();
                                                                        JRInstmt2.unlock();
                                                                        {
                                                                            try {
                                                                                {
                                                                                }
                                                                            } catch (Exception JRe) {
                                                                                if (JRrrecv2.retOp != null && JRrrecv2.fretOp == null)
                                                                                {
                                                                                    // forward of cocall
                                                                                    if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                        JRrrecv2.handler.JRhandler(JRe);
                                                                                    else {
                                                                                        // give preference to propagation through the call stack
                                                                                        JRrrecv2.retOp.send(jrvm.getTimestamp(), JRe);
                                                                                        JRrrecv2.retOp = null;
                                                                                    }
                                                                                }
                                                                                else if ((JRrrecv2.retOp != null) && (JRrrecv2.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                {
                                                                                    // for cocall exception handling in operation invocation
                                                                                    if (JRrrecv2.handler != null)
                                                                                        JRrrecv2.handler.JRhandler(JRe);
                                                                                        else {
                                                                                            // catch all
                                                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                        }
JRrrecv2.fretOp.send(jrvm.getTimestamp(), JRrrecv2.handler, (java.lang.Object []) null);
                                                                                    JRrrecv2.fretOp = null;
                                                                                }
                                                                                else if ((JRrrecv2.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                {
                                                                                    // this should only be a send
                                                                                    JRrrecv2.handler.JRhandler(JRe);
                                                                                }
    else {
                                                                                        // catch all
                                                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                    }
                                                                            }
                                                                        }
                                                                        { if (JRrrecv2.retOp != null)
                                                                            JRrrecv2.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                                                    }
                                                                    else
                                                                        JRInstmt2.releaseIter();
                                                                    // End of servicing
                                                                    // End InniArm
                                                                    break;
                                                                }
                                                                
                                                            }
                                                        }
                                                        if (!JRInstmt2.serviced)
                                                        {
                                                            // must block and loop
                                                            JRInstmt2.waitOnLock();
                                                        }
                                                    } while (!JRInstmt2.serviced);
                                                }
                                                // End Inni
                                                
                                                return_to_caller.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, (java.lang.Object[]) null);
                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    { if (JRrrecv6.retOp != null)
                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 3:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    if (JRget_op_m_wait_Cap_voidTovoidXintTovoid().length() == 0)
                                        JRrrecv6 = JRtmprecv6;
                                    if (JRrrecv6 != null)
                                        break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
                                    {
                                        try {
                                            {
                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    { if (JRrrecv6.retOp != null)
                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 4:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    JRrrecv6 = JRtmprecv6;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
                                    {
                                        try {
                                            {
                                                boolean ret = false;
                                                // Begin Expr2
                                                ret = (JRget_op_m_wait_Cap_voidTovoidXintTovoid().length() == 0);
                                                // Return
                                                {
                                                    if (true)
                                                        { if (JRrrecv6.retOp != null)
                                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(boolean)(ret)});
                                                        else {
                                                            boolean JRevaltmp = ret;
                                                            
                                                        }
                                                        break _label_JRInstmt6; }}
                                                
                                                // End Return

                                            }
                                        } catch (Exception JRe) {
                                            if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                            {
                                                // forward of cocall
                                                if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // give preference to propagation through the call stack
                                                    JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                    JRrrecv6.retOp = null;
                                                }
                                            }
                                            else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // for cocall exception handling in operation invocation
                                                if (JRrrecv6.handler != null)
                                                    JRrrecv6.handler.JRhandler(JRe);
                                                    else {
                                                        // catch all
                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                    }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                                JRrrecv6.fretOp = null;
                                            }
                                            else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            {
                                                // this should only be a send
                                                JRrrecv6.handler.JRhandler(JRe);
                                            }
    else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
                                        }
                                    }
                                    
                                }
                                else
                                    JRInstmt6.releaseIter();
                                // End of servicing
                                // End InniArm
                                break;
                            }
                            case 5:
                            {
                                JRInstmt6.j = 0;
                                // Inni Arm
                                QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                                Recv_ext JRrrecv6 = null, JRtmprecv6;
                                for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                     JRInstmt6.iter.hasNext();)
                                {
                                    JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                    JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                    JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                    // extract values
                                    JRrrecv6 = JRtmprecv6;
                                    break;  // get first one
                                }
                                // Start of servicing
                                if (JRrrecv6 != null)
                                {
                                    JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                    JRInstmt6.serviced = true;
                                    JRInstmt6.iter.remove(JRInstmt6.j);
                                    JRInstmt6.releaseIter();
                                    JRInstmt6.unlock();
                                    {
                                        try {
                                            {
                                                int ret = -99999;
                                                if (JRget_op_m_wait_ranks_intTovoid().length() != 0) {
                                                    {
                                                        // Inni Statement without quantifier
                                                        JRInstmt3.armArray[0] = new QuantRec(new Cap_ext_(op_m_wait_ranks_intTovoid, "void"), 0, 0);
                                                        JRInstmt3.lock();
                                                        // Equivalence Class has been created and locked
                                                        JRInstmt3.serviced = false;
                                                        _label_JRInstmt3: do
                                                        {
                                                            Invocation JRfinalInvoc3 = null;
                                                            // find THE invocation and service it
                                                            JRInstmt3.gatherAndSortTimes();
                                                            for (JRInstmt3.i = 0;
                                                                (JRInstmt3.i < JRInstmt3.N) && !JRInstmt3.serviced;
                                                                 JRInstmt3.i++)
                                                            {
                                                                JRInstmt3.byStrt = true;
                                                                JRInstmt3.releaseIter();
                                                                // if the op is empty
                                                                if (JRInstmt3.timesArray[JRInstmt3.i].time < 0) continue;
                                                                switch (JRInstmt3.timesArray[JRInstmt3.i].opNum)
                                                                {
                                                                    case 0:
                                                                    {
                                                                        JRInstmt3.j = 0;
                                                                        // Inni Arm
                                                                        int JRbyVal3 = 0; /* init to hush javac */
                                                                        int JRcurVal3 = 0; /* init to hush javac */
                                                                        QuantRec JRquantRec3 = (QuantRec)JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex];
                                                                        Recv_ext JRrrecv3 = null, JRtmprecv3;
                                                                        // not artificial
                                                                        int rank = 0;
                                                                        for (JRInstmt3.iter = JRInstmt3.armArray[JRInstmt3.timesArray[JRInstmt3.i].armArrayIndex].theCap.elements();
                                                                             JRInstmt3.iter.hasNext();)
                                                                        {
                                                                            JRtmprecv3 = (Recv_ext)JRInstmt3.iter.next();
                                                                            JRInstmt3.JRinit.setInvoc(JRInstmt3.j++);
                                                                            JRtmprecv3.setInvocation(JRInstmt3.JRinit);
                                                                            // extract values
                                                                            // GetMethod 2
                                                                            rank = ((Number) JRtmprecv3.JRargs[0]).intValue();
                                                                            ;
                                                                            JRcurVal3 = rank;
                                                                            if (JRInstmt3.byStrt || (JRcurVal3 < JRbyVal3)){
                                                                                JRInstmt3.byStrt = false;
                                                                                JRbyVal3  = JRcurVal3;
                                                                                JRInstmt3.curInvoc = JRInstmt3.iter.getCurInvoc();
                                                                                JRrrecv3 = JRtmprecv3;
                                                                            }
                                                                                                                                            }
                                                                    // Start of servicing
                                                                    if (JRrrecv3 != null)
                                                                    {
                                                                        JRInstmt3.serviced = true;
                                                                        JRInstmt3.iter.remove(JRInstmt3.curInvoc);
                                                                        // GetMethod 4
                                                                        rank = ((Number) JRrrecv3.JRargs[0]).intValue();
                                                                        JRInstmt3.releaseIter();
                                                                        JRInstmt3.unlock();
                                                                        {
                                                                            try {
                                                                                {
                                                                                    JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {rank});
                                                                                    // Begin Expr2
                                                                                    ret = rank;
                                                                                }
                                                                            } catch (Exception JRe) {
                                                                                if (JRrrecv3.retOp != null && JRrrecv3.fretOp == null)
                                                                                {
                                                                                    // forward of cocall
                                                                                    if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                        JRrrecv3.handler.JRhandler(JRe);
                                                                                    else {
                                                                                        // give preference to propagation through the call stack
                                                                                        JRrrecv3.retOp.send(jrvm.getTimestamp(), JRe);
                                                                                        JRrrecv3.retOp = null;
                                                                                    }
                                                                                }
                                                                                else if ((JRrrecv3.retOp != null) && (JRrrecv3.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                {
                                                                                    // for cocall exception handling in operation invocation
                                                                                    if (JRrrecv3.handler != null)
                                                                                        JRrrecv3.handler.JRhandler(JRe);
                                                                                        else {
                                                                                            // catch all
                                                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                        }
JRrrecv3.fretOp.send(jrvm.getTimestamp(), JRrrecv3.handler, (java.lang.Object []) null);
                                                                                    JRrrecv3.fretOp = null;
                                                                                }
                                                                                else if ((JRrrecv3.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                {
                                                                                    // this should only be a send
                                                                                    JRrrecv3.handler.JRhandler(JRe);
                                                                                }
    else {
                                                                                        // catch all
                                                                                        throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                    }
                                                                            }
                                                                        }
                                                                        { if (JRrrecv3.retOp != null)
                                                                            JRrrecv3.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                                                    }
                                                                    else
                                                                        JRInstmt3.releaseIter();
                                                                    // End of servicing
                                                                    // End InniArm
                                                                    break;
                                                                }
                                                                
                                                            }
                                                        }
                                                        if (!JRInstmt3.serviced)
                                                        {
                                                            // must block and loop
                                                            JRInstmt3.waitOnLock();
                                                        }
                                                    } while (!JRInstmt3.serviced);
                                                }
                                                // End Inni
                                                
                                            } else {
                                                // Begin Expr2
                                                System.out.println("\t**** minrank called on empty Q ****");
                                                // Begin Expr2
                                                System.out.flush();
                                                // Begin Expr2
                                                ret = 999999;
                                            }
                                            // Return
                                            {
                                                if (true)
                                                    { if (JRrrecv6.retOp != null)
                                                        JRrrecv6.retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {(int)(ret)});
                                                    else {
                                                        int JRevaltmp = ret;
                                                        
                                                    }
                                                    break _label_JRInstmt6; }}
                                            
                                            // End Return

                                        }
                                    } catch (Exception JRe) {
                                        if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                        {
                                            // forward of cocall
                                            if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                JRrrecv6.handler.JRhandler(JRe);
                                            else {
                                                // give preference to propagation through the call stack
                                                JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                                JRrrecv6.retOp = null;
                                            }
                                        }
                                        else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // for cocall exception handling in operation invocation
                                            if (JRrrecv6.handler != null)
                                                JRrrecv6.handler.JRhandler(JRe);
                                                else {
                                                    // catch all
                                                    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                            JRrrecv6.fretOp = null;
                                        }
                                        else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                        {
                                            // this should only be a send
                                            JRrrecv6.handler.JRhandler(JRe);
                                        }
    else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
                                    }
                                }
                                
                            }
                            else
                                JRInstmt6.releaseIter();
                            // End of servicing
                            // End InniArm
                            break;
                        }
                        case 6:
                        {
                            JRInstmt6.j = 0;
                            // Inni Arm
                            QuantRec JRquantRec6 = (QuantRec)JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex];
                            Recv_ext JRrrecv6 = null, JRtmprecv6;
                            for (JRInstmt6.iter = JRInstmt6.armArray[JRInstmt6.timesArray[JRInstmt6.i].armArrayIndex].theCap.elements();
                                 JRInstmt6.iter.hasNext();)
                            {
                                JRtmprecv6 = (Recv_ext)JRInstmt6.iter.next();
                                JRInstmt6.JRinit.setInvoc(JRInstmt6.j++);
                                JRtmprecv6.setInvocation(JRInstmt6.JRinit);
                                // extract values
                                JRrrecv6 = JRtmprecv6;
                                break;  // get first one
                            }
                            // Start of servicing
                            if (JRrrecv6 != null)
                            {
                                JRInstmt6.j = (int)JRrrecv6.getInvoc();
                                JRInstmt6.serviced = true;
                                JRInstmt6.iter.remove(JRInstmt6.j);
                                JRInstmt6.releaseIter();
                                JRInstmt6.unlock();
                                {
                                    try {
                                        {
                                            int x = JRget_op_m_wait_Cap_voidTovoidXintTovoid().length();
                                            String buffer = "\t**** Printing for " + name + " **** " + x + " waiting process(es)";
                                            if (x > 0) {
                                                int r = /*JR init for inni*/ 0;
                                                int minr = /*JR init for inni*/ 0;
                                                boolean same = true;
                                                // Receive
                                                {
                                                    jrvm.sendAndDie();
                                                    Recv_ext recv_intTovoid = JRget_op_m_wait_ranks_intTovoid().recv();
                                                    minr = (Integer) recv_intTovoid.JRargs[0];
                                                    jrvm.ariseAndReceive();
                                                    if (recv_intTovoid.retOp != null)
                                                        recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                                                }
                                                // End Receive
                                                
                                                JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {minr});
                                                JRLoop0: for (int i = 2; i <= x; i++) {
                                                    // Receive
                                                    {
                                                        jrvm.sendAndDie();
                                                        Recv_ext recv_intTovoid = JRget_op_m_wait_ranks_intTovoid().recv();
                                                        r = (Integer) recv_intTovoid.JRargs[0];
                                                        jrvm.ariseAndReceive();
                                                        if (recv_intTovoid.retOp != null)
                                                            recv_intTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                                                    }
                                                    // End Receive
                                                    
                                                    JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {r});
                                                    // Begin Expr2
                                                    same = same && (r == minr);
                                                }
                                                if (same) {
                                                    // Begin Expr2
                                                    buffer += ", all with rank " + minr;
                                                } else {
                                                    Op_ext.JRProxyOp op_order_intTovoid = null;
                                                    try{
                                                        op_order_intTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
                                                    } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
                                                    
                                                    
                                                    // Begin Expr2
                                                    buffer += ", with ranks:";
                                                    JRLoop1: for (int i = 1; i <= x; i++) {
                                                        {
                                                            // Inni Statement without quantifier
                                                            JRInstmt4.armArray[0] = new QuantRec(new Cap_ext_(op_m_wait_ranks_intTovoid, "void"), 0, 0);
                                                            JRInstmt4.lock();
                                                            // Equivalence Class has been created and locked
                                                            JRInstmt4.serviced = false;
                                                            _label_JRInstmt4: do
                                                            {
                                                                Invocation JRfinalInvoc4 = null;
                                                                // find THE invocation and service it
                                                                JRInstmt4.gatherAndSortTimes();
                                                                for (JRInstmt4.i = 0;
                                                                    (JRInstmt4.i < JRInstmt4.N) && !JRInstmt4.serviced;
                                                                     JRInstmt4.i++)
                                                                {
                                                                    JRInstmt4.byStrt = true;
                                                                    JRInstmt4.releaseIter();
                                                                    // if the op is empty
                                                                    if (JRInstmt4.timesArray[JRInstmt4.i].time < 0) continue;
                                                                    switch (JRInstmt4.timesArray[JRInstmt4.i].opNum)
                                                                    {
                                                                        case 0:
                                                                        {
                                                                            JRInstmt4.j = 0;
                                                                            // Inni Arm
                                                                            int JRbyVal4 = 0; /* init to hush javac */
                                                                            int JRcurVal4 = 0; /* init to hush javac */
                                                                            QuantRec JRquantRec4 = (QuantRec)JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex];
                                                                            Recv_ext JRrrecv4 = null, JRtmprecv4;
                                                                            // not artificial
                                                                            int rank = 0;
                                                                            for (JRInstmt4.iter = JRInstmt4.armArray[JRInstmt4.timesArray[JRInstmt4.i].armArrayIndex].theCap.elements();
                                                                                 JRInstmt4.iter.hasNext();)
                                                                            {
                                                                                JRtmprecv4 = (Recv_ext)JRInstmt4.iter.next();
                                                                                JRInstmt4.JRinit.setInvoc(JRInstmt4.j++);
                                                                                JRtmprecv4.setInvocation(JRInstmt4.JRinit);
                                                                                // extract values
                                                                                // GetMethod 2
                                                                                rank = ((Number) JRtmprecv4.JRargs[0]).intValue();
                                                                                ;
                                                                                JRcurVal4 = rank;
                                                                                if (JRInstmt4.byStrt || (JRcurVal4 < JRbyVal4)){
                                                                                    JRInstmt4.byStrt = false;
                                                                                    JRbyVal4  = JRcurVal4;
                                                                                    JRInstmt4.curInvoc = JRInstmt4.iter.getCurInvoc();
                                                                                    JRrrecv4 = JRtmprecv4;
                                                                                }
                                                                                                                                                    }
                                                                        // Start of servicing
                                                                        if (JRrrecv4 != null)
                                                                        {
                                                                            JRInstmt4.serviced = true;
                                                                            JRInstmt4.iter.remove(JRInstmt4.curInvoc);
                                                                            // GetMethod 4
                                                                            rank = ((Number) JRrrecv4.JRargs[0]).intValue();
                                                                            JRInstmt4.releaseIter();
                                                                            JRInstmt4.unlock();
                                                                            {
                                                                                try {
                                                                                    {
                                                                                        // Begin Expr2
                                                                                        buffer += " " + rank;
                                                                                        op_order_intTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {rank});
                                                                                    }
                                                                                } catch (Exception JRe) {
                                                                                    if (JRrrecv4.retOp != null && JRrrecv4.fretOp == null)
                                                                                    {
                                                                                        // forward of cocall
                                                                                        if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                            JRrrecv4.handler.JRhandler(JRe);
                                                                                        else {
                                                                                            // give preference to propagation through the call stack
                                                                                            JRrrecv4.retOp.send(jrvm.getTimestamp(), JRe);
                                                                                            JRrrecv4.retOp = null;
                                                                                        }
                                                                                    }
                                                                                    else if ((JRrrecv4.retOp != null) && (JRrrecv4.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // for cocall exception handling in operation invocation
                                                                                        if (JRrrecv4.handler != null)
                                                                                            JRrrecv4.handler.JRhandler(JRe);
                                                                                            else {
                                                                                                // catch all
                                                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                            }
JRrrecv4.fretOp.send(jrvm.getTimestamp(), JRrrecv4.handler, (java.lang.Object []) null);
                                                                                        JRrrecv4.fretOp = null;
                                                                                    }
                                                                                    else if ((JRrrecv4.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // this should only be a send
                                                                                        JRrrecv4.handler.JRhandler(JRe);
                                                                                    }
    else {
                                                                                            // catch all
                                                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                        }
                                                                                }
                                                                            }
                                                                            { if (JRrrecv4.retOp != null)
                                                                                JRrrecv4.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                                                        }
                                                                        else
                                                                            JRInstmt4.releaseIter();
                                                                        // End of servicing
                                                                        // End InniArm
                                                                        break;
                                                                    }
                                                                    
                                                                }
                                                            }
                                                            if (!JRInstmt4.serviced)
                                                            {
                                                                // must block and loop
                                                                JRInstmt4.waitOnLock();
                                                            }
                                                        } while (!JRInstmt4.serviced);
                                                    }
                                                    // End Inni
                                                    
                                                }
                                                JRLoop2: for (int i = 1; i <= x; i++) {
                                                    {
                                                        // Inni Statement without quantifier
                                                        JRInstmt5.armArray[0] = new QuantRec(new Cap_ext_(op_order_intTovoid, "void"), 0, 0);
                                                        JRInstmt5.lock();
                                                        // Equivalence Class has been created and locked
                                                        JRInstmt5.serviced = false;
                                                        _label_JRInstmt5: do
                                                        {
                                                            Invocation JRfinalInvoc5 = null;
                                                            // find THE invocation and service it
                                                            JRInstmt5.gatherAndSortTimes();
                                                            for (JRInstmt5.i = 0;
                                                                (JRInstmt5.i < JRInstmt5.N) && !JRInstmt5.serviced;
                                                                 JRInstmt5.i++)
                                                            {
                                                                JRInstmt5.byStrt = true;
                                                                JRInstmt5.releaseIter();
                                                                // if the op is empty
                                                                if (JRInstmt5.timesArray[JRInstmt5.i].time < 0) continue;
                                                                switch (JRInstmt5.timesArray[JRInstmt5.i].opNum)
                                                                {
                                                                    case 0:
                                                                    {
                                                                        JRInstmt5.j = 0;
                                                                        // Inni Arm
                                                                        QuantRec JRquantRec5 = (QuantRec)JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex];
                                                                        Recv_ext JRrrecv5 = null, JRtmprecv5;
                                                                        // not artificial
                                                                        int rank = 0;
                                                                        for (JRInstmt5.iter = JRInstmt5.armArray[JRInstmt5.timesArray[JRInstmt5.i].armArrayIndex].theCap.elements();
                                                                             JRInstmt5.iter.hasNext();)
                                                                        {
                                                                            JRtmprecv5 = (Recv_ext)JRInstmt5.iter.next();
                                                                            JRInstmt5.JRinit.setInvoc(JRInstmt5.j++);
                                                                            JRtmprecv5.setInvocation(JRInstmt5.JRinit);
                                                                            // extract values
                                                                            // GetMethod 2
                                                                            rank = ((Number) JRtmprecv5.JRargs[0]).intValue();
                                                                            ;
                                                                            JRrrecv5 = JRtmprecv5;
                                                                            break;  // get first one
                                                                        }
                                                                        // Start of servicing
                                                                        if (JRrrecv5 != null)
                                                                        {
                                                                            JRInstmt5.j = (int)JRrrecv5.getInvoc();
                                                                            JRInstmt5.serviced = true;
                                                                            JRInstmt5.iter.remove(JRInstmt5.j);
                                                                            JRInstmt5.releaseIter();
                                                                            JRInstmt5.unlock();
                                                                            {
                                                                                try {
                                                                                    {
                                                                                        JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {rank});
                                                                                    }
                                                                                } catch (Exception JRe) {
                                                                                    if (JRrrecv5.retOp != null && JRrrecv5.fretOp == null)
                                                                                    {
                                                                                        // forward of cocall
                                                                                        if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                            JRrrecv5.handler.JRhandler(JRe);
                                                                                        else {
                                                                                            // give preference to propagation through the call stack
                                                                                            JRrrecv5.retOp.send(jrvm.getTimestamp(), JRe);
                                                                                            JRrrecv5.retOp = null;
                                                                                        }
                                                                                    }
                                                                                    else if ((JRrrecv5.retOp != null) && (JRrrecv5.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // for cocall exception handling in operation invocation
                                                                                        if (JRrrecv5.handler != null)
                                                                                            JRrrecv5.handler.JRhandler(JRe);
                                                                                            else {
                                                                                                // catch all
                                                                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                            }
JRrrecv5.fretOp.send(jrvm.getTimestamp(), JRrrecv5.handler, (java.lang.Object []) null);
                                                                                        JRrrecv5.fretOp = null;
                                                                                    }
                                                                                    else if ((JRrrecv5.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                                                                    {
                                                                                        // this should only be a send
                                                                                        JRrrecv5.handler.JRhandler(JRe);
                                                                                    }
    else {
                                                                                            // catch all
                                                                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                                                                        }
                                                                                }
                                                                            }
                                                                            { if (JRrrecv5.retOp != null)
                                                                                JRrrecv5.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                                                                        }
                                                                        else
                                                                            JRInstmt5.releaseIter();
                                                                        // End of servicing
                                                                        // End InniArm
                                                                        break;
                                                                    }
                                                                    
                                                                }
                                                            }
                                                            if (!JRInstmt5.serviced)
                                                            {
                                                                // must block and loop
                                                                JRInstmt5.waitOnLock();
                                                            }
                                                        } while (!JRInstmt5.serviced);
                                                    }
                                                    // End Inni
                                                    
                                                }
                                            }
                                        }
                                        // Begin Expr2
                                        System.out.println(buffer);
                                    }
                                } catch (Exception JRe) {
                                    if (JRrrecv6.retOp != null && JRrrecv6.fretOp == null)
                                    {
                                        // forward of cocall
                                        if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                            JRrrecv6.handler.JRhandler(JRe);
                                        else {
                                            // give preference to propagation through the call stack
                                            JRrrecv6.retOp.send(jrvm.getTimestamp(), JRe);
                                            JRrrecv6.retOp = null;
                                        }
                                    }
                                    else if ((JRrrecv6.retOp != null) && (JRrrecv6.fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
                                    {
                                        // for cocall exception handling in operation invocation
                                        if (JRrrecv6.handler != null)
                                            JRrrecv6.handler.JRhandler(JRe);
                                            else {
                                                // catch all
                                                throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                            }
JRrrecv6.fretOp.send(jrvm.getTimestamp(), JRrrecv6.handler, (java.lang.Object []) null);
                                        JRrrecv6.fretOp = null;
                                    }
                                    else if ((JRrrecv6.handler != null) && !(JRe instanceof java.rmi.RemoteException))
                                    {
                                        // this should only be a send
                                        JRrrecv6.handler.JRhandler(JRe);
                                    }
    else {
                                            // catch all
                                            throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at " + jrRuntimeError.where(JRe));
                                        }
                                }
                            }
                            { if (JRrrecv6.retOp != null)
                                JRrrecv6.retOp.send(jrvm.getTimestamp(), (java.lang.Object []) null); }
                        }
                        else
                            JRInstmt6.releaseIter();
                        // End of servicing
                        // End InniArm
                        break;
                    }
                    
                }
            }
            if (!JRInstmt6.serviced)
            {
                // must block and loop
                JRInstmt6.waitOnLock();
            }
        } while (!JRInstmt6.serviced);
    }
    // End Inni
    
}
}
} catch (Exception JRe)    {
    if (retOp != null && fretOp == null)
    {
	// if it is a forward cocall with handler
	if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
	    handler.JRhandler(JRe);
	else
	    // give preference to propagation through the call stack
	    retOp.send(jrvm.getTimestamp(), JRe);
    }
    else if ((retOp != null) && (fretOp != null) && !(JRe instanceof java.rmi.RemoteException))
    {
	// for COSTMT exception handling in operation
	if (handler != null)
	    handler.JRhandler(JRe);
	fretOp.send(jrvm.getTimestamp(), handler, (java.lang.Object []) null);
    }
    else if ((handler != null) && !(JRe instanceof java.rmi.RemoteException))
    {
	// this should only be for a send/forward
	handler.JRhandler(JRe);
	// can rethrow below just to get out of this method
    }
    // rethrow the proper type of exception
    // catch all
    throw new jrRuntimeError("Unhandled exception: " + JRe.toString()+ " at "+ jrRuntimeError.where(JRe));
}
}

protected boolean JRcalled = false;
protected JRm_condvar jrresref;
public Object JRgetjrresref()
{ try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
protected void JRinit() {
	if(this.JRcalled) return;
	try {
	op_start_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implstart(this));
	op_m_print_voidTovoid = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	op_m_minrank_voidToint = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	op_m_empty_voidToboolean = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	op_m_signal_all_voidTovoid = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	op_m_signal_voidToboolean = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	op_m_wait_ranks_intTovoid = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	op_m_wait_Cap_voidTovoidXintTovoid = 
	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
	} catch (Exception JRe)
	{ throw new jrRuntimeError(JRe.toString()); }
	jrresref = new JRm_condvar(op_start_voidTovoid, op_m_print_voidTovoid, op_m_minrank_voidToint, op_m_empty_voidToboolean, op_m_signal_all_voidTovoid, op_m_signal_voidToboolean, op_m_wait_ranks_intTovoid, op_m_wait_Cap_voidTovoidXintTovoid);
	this.JRcalled = true;
}
private boolean JRproc = false;
private void JRprocess() {
	if (JRproc) return;
	JRproc = true;
}
}
