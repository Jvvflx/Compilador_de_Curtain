/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import curtain.analysis.*;

@SuppressWarnings("nls")
public final class ASomaExpr extends PExpr
{
    private PExpr _expr_;
    private TMais _mais_;
    private PFactor _factor_;

    public ASomaExpr()
    {
        // Constructor
    }

    public ASomaExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TMais _mais_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setExpr(_expr_);

        setMais(_mais_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new ASomaExpr(
            cloneNode(this._expr_),
            cloneNode(this._mais_),
            cloneNode(this._factor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASomaExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TMais getMais()
    {
        return this._mais_;
    }

    public void setMais(TMais node)
    {
        if(this._mais_ != null)
        {
            this._mais_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mais_ = node;
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._mais_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._mais_ == child)
        {
            this._mais_ = null;
            return;
        }

        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._mais_ == oldChild)
        {
            setMais((TMais) newChild);
            return;
        }

        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
