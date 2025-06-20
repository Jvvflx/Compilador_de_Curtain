/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import curtain.analysis.*;

@SuppressWarnings("nls")
public final class AAltName extends PAltName
{
    private TChaveEsq _chaveEsq_;
    private TId _id_;
    private TChaveDir _chaveDir_;

    public AAltName()
    {
        // Constructor
    }

    public AAltName(
        @SuppressWarnings("hiding") TChaveEsq _chaveEsq_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TChaveDir _chaveDir_)
    {
        // Constructor
        setChaveEsq(_chaveEsq_);

        setId(_id_);

        setChaveDir(_chaveDir_);

    }

    @Override
    public Object clone()
    {
        return new AAltName(
            cloneNode(this._chaveEsq_),
            cloneNode(this._id_),
            cloneNode(this._chaveDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAltName(this);
    }

    public TChaveEsq getChaveEsq()
    {
        return this._chaveEsq_;
    }

    public void setChaveEsq(TChaveEsq node)
    {
        if(this._chaveEsq_ != null)
        {
            this._chaveEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chaveEsq_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TChaveDir getChaveDir()
    {
        return this._chaveDir_;
    }

    public void setChaveDir(TChaveDir node)
    {
        if(this._chaveDir_ != null)
        {
            this._chaveDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chaveDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chaveEsq_)
            + toString(this._id_)
            + toString(this._chaveDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chaveEsq_ == child)
        {
            this._chaveEsq_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._chaveDir_ == child)
        {
            this._chaveDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chaveEsq_ == oldChild)
        {
            setChaveEsq((TChaveEsq) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._chaveDir_ == oldChild)
        {
            setChaveDir((TChaveDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
