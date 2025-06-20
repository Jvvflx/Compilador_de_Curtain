/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import curtain.analysis.*;

@SuppressWarnings("nls")
public final class ASinonimoAtr extends PAtr
{
    private PTipos _tipos_;
    private TId _id_;
    private TIgualdade _igualdade_;
    private TId2 _id2_;
    private TSemicolon _semicolon_;

    public ASinonimoAtr()
    {
        // Constructor
    }

    public ASinonimoAtr(
        @SuppressWarnings("hiding") PTipos _tipos_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TIgualdade _igualdade_,
        @SuppressWarnings("hiding") TId2 _id2_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setTipos(_tipos_);

        setId(_id_);

        setIgualdade(_igualdade_);

        setId2(_id2_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ASinonimoAtr(
            cloneNode(this._tipos_),
            cloneNode(this._id_),
            cloneNode(this._igualdade_),
            cloneNode(this._id2_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASinonimoAtr(this);
    }

    public PTipos getTipos()
    {
        return this._tipos_;
    }

    public void setTipos(PTipos node)
    {
        if(this._tipos_ != null)
        {
            this._tipos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipos_ = node;
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

    public TIgualdade getIgualdade()
    {
        return this._igualdade_;
    }

    public void setIgualdade(TIgualdade node)
    {
        if(this._igualdade_ != null)
        {
            this._igualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igualdade_ = node;
    }

    public TId2 getId2()
    {
        return this._id2_;
    }

    public void setId2(TId2 node)
    {
        if(this._id2_ != null)
        {
            this._id2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id2_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipos_)
            + toString(this._id_)
            + toString(this._igualdade_)
            + toString(this._id2_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipos_ == child)
        {
            this._tipos_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._igualdade_ == child)
        {
            this._igualdade_ = null;
            return;
        }

        if(this._id2_ == child)
        {
            this._id2_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipos_ == oldChild)
        {
            setTipos((PTipos) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._igualdade_ == oldChild)
        {
            setIgualdade((TIgualdade) newChild);
            return;
        }

        if(this._id2_ == oldChild)
        {
            setId2((TId2) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
