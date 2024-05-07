/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


import java.util.Random;

public class prog extends java.lang.Object {
    { JRinit(); }
    
    public prog() {
        // Begin Expr2
        super();
        JRprocess();
    }
    static Random random;
    static boolean vulnerable;
    static final int n = 50;
    static final int m = 25;
    static Op_ext.JRProxyOp JRget_op_esperaB_voidTovoid()
    {
        return op_esperaB_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_esperaB_voidTovoid;
    ;
    static    {
        try    {
            op_esperaB_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_esperaB_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_esperaR_voidTovoid()
    {
        return op_esperaR_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_esperaR_voidTovoid;
    ;
    static    {
        try    {
            op_esperaR_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_esperaR_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_bloquear_voidTovoid()
    {
        return op_bloquear_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_bloquear_voidTovoid;
    ;
    static    {
        try    {
            op_bloquear_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_bloquear_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_morir_voidTovoid()
    {
        return op_morir_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_morir_voidTovoid;
    ;
    static    {
        try    {
            op_morir_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 0;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_morir_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static int cantB;
    static Op_ext.JRProxyOp JRget_op_mutexB_voidTovoid()
    {
        return op_mutexB_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutexB_voidTovoid;
    ;
    static    {
        try    {
            op_mutexB_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 4;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_mutexB_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static int cantR;
    static Op_ext.JRProxyOp JRget_op_mutexR_voidTovoid()
    {
        return op_mutexR_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_mutexR_voidTovoid;
    ;
    static    {
        try    {
            op_mutexR_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
            {
                long JRTotal = 2;
                if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
                for (long JRiter = 0; JRiter < JRTotal; JRiter++)
                    op_mutexR_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
            }
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static Op_ext.JRProxyOp JRget_op_X_voidTovoid()
    {
        return op_X_voidTovoid;
    }
    
    public static Op_ext.JRProxyOp op_X_voidTovoid;
    static class ProcOp_voidTovoid_implX extends ProcOp_ext_impl
    {
        public ProcOp_voidTovoid_implX(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.XvoidTovoid(null, null, null, JRargs);
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
                    prog.XvoidTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    ;
    static    {
        try    {
            op_X_voidTovoid = new Op_ext_.JRProxyOp(new ProcOp_voidTovoid_implX(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void XvoidTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_X_voidTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void XvoidTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            {
                JRLoop0: while (!(vulnerable)) {
                    // Begin Expr2
                    vulnerable = random.nextBoolean();
                    // Begin Expr2
                    System.out.println("No soy vulnerable");
                }
                // Begin Expr2
                System.out.println("Soy vulnerable");
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = JRget_op_morir_voidTovoid().recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
                // Begin Expr2
                System.out.println("Huesped X murio");
                // Return
                { if (retOp != null)
                    retOp.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, null);
                return ; }
                // End Return

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
    static {
        try {
            op_X_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    static Op_ext.JRProxyOp JRget_op_blanco_intTovoid()
    {
        return op_blanco_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_blanco_intTovoid;
    static class ProcOp_intTovoid_implblanco extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implblanco(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.blancointTovoid(null, null, null, JRargs);
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
                    prog.blancointTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    ;
    static    {
        try    {
            op_blanco_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implblanco(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void blancointTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_blanco_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void blancointTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                JRLoop1: while (true) {
                    if (vulnerable) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = JRget_op_mutexB_voidTovoid().recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // Begin Expr2
                        cantB += 1;
                        if (cantB == 4) {
                            // Begin Expr2
                            System.out.println("Soy Blanco n" + cantB + " id " + i + " y desbloqueo a los rojos que me esperan");
                            JRget_op_esperaB_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                            {
                                jrvm.sendAndDie();
                                Recv_ext recv_voidTovoid = JRget_op_esperaR_voidTovoid().recv();
                                jrvm.ariseAndReceive();
                                if (recv_voidTovoid.retOp != null)
                                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                            }
                            JRget_op_morir_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                        } else {
                            // Begin Expr2
                            System.out.println("Soy Blanco n" + cantB + " id " + i + " me bloqueo");
                            {
                                jrvm.sendAndDie();
                                Recv_ext recv_voidTovoid = JRget_op_bloquear_voidTovoid().recv();
                                jrvm.ariseAndReceive();
                                if (recv_voidTovoid.retOp != null)
                                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                            }
                        }
                    }
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
    static {
        try {
            for (int i = 0; i < n; i++) {
                op_blanco_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    static Op_ext.JRProxyOp JRget_op_rojo_intTovoid()
    {
        return op_rojo_intTovoid;
    }
    
    public static Op_ext.JRProxyOp op_rojo_intTovoid;
    static class ProcOp_intTovoid_implrojo extends ProcOp_ext_impl
    {
        public ProcOp_intTovoid_implrojo(prog thisIn) throws RemoteException
        {
        }
        public java.lang.Object call(long JRtimestamp, java.lang.Object [] JRargs) throws RemoteException
        {
            jrvm.ariseAndReceive();  // from caller
            try    {
                jrvm.setTimestamp(JRtimestamp);
                prog.rojointTovoid(null, null, null, JRargs);
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
                    prog.rojointTovoid(this.retOp, this.fretOp, this.handler, this.JRargs);
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
    ;
    static    {
        try    {
            op_rojo_intTovoid = new Op_ext_.JRProxyOp(new ProcOp_intTovoid_implrojo(null));
        } catch (Exception e) { throw new jrRuntimeError(e.toString());}
    }
    
    static void rojointTovoid(java.lang.Object [] JRargs) {
        ((Op_ext_.JRProxyOp)op_rojo_intTovoid).call(jrvm.getTimestamp(), JRargs);
    }
    private static void rojointTovoid(Op_ext.JRProxyOp retOp, Cap_ext fretOp, edu.ucdavis.jr.RemoteHandler handler, java.lang.Object [] JRargs)
    {
        try    {
            // GetMethod 1
            int i = ((Number) JRargs[0]).intValue();
            {
                JRLoop2: while (true) {
                    if (vulnerable) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = JRget_op_mutexR_voidTovoid().recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                        // Begin Expr2
                        cantR += 1;
                        if (cantR == 2) {
                            // Begin Expr2
                            System.out.println("Soy Rojo n" + cantR + " id " + i + " y desbloqueo a los blancos que me esperan");
                            JRget_op_esperaR_voidTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
                            {
                                jrvm.sendAndDie();
                                Recv_ext recv_voidTovoid = JRget_op_esperaB_voidTovoid().recv();
                                jrvm.ariseAndReceive();
                                if (recv_voidTovoid.retOp != null)
                                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                            }
                        } else {
                            // Begin Expr2
                            System.out.println("Soy Rojo n" + cantR + " id " + i + " me bloqueo");
                            {
                                jrvm.sendAndDie();
                                Recv_ext recv_voidTovoid = JRget_op_bloquear_voidTovoid().recv();
                                jrvm.ariseAndReceive();
                                if (recv_voidTovoid.retOp != null)
                                    recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                            }
                        }
                    }
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
    static {
        try {
            for (int i = 0; i < m; i++) {
                op_rojo_intTovoid.send(jrvm.getTimestamp(), new java.lang.Object [] {i});
            }
        } catch (Exception JRe) { throw new jrRuntimeError(JRe.toString()); }
    };
    
    
    public static void main(String[] args) {
        // Begin Expr2
        random = new Random();
        // Begin Expr2
        vulnerable = random.nextBoolean();
        // Begin Expr2
        cantB = 0;
        // Begin Expr2
        cantR = 0;
        prog p = new prog();
    }
    protected boolean JRcalled = false;
    protected JRprog jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	jrresref = new JRprog(op_rojo_intTovoid, op_blanco_intTovoid, op_X_voidTovoid, op_mutexR_voidTovoid, op_mutexB_voidTovoid, op_morir_voidTovoid, op_bloquear_voidTovoid, op_esperaR_voidTovoid, op_esperaB_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}
