/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import curtain.analysis.*;

@SuppressWarnings("nls")
public final class TString extends Token
{
    public TString(String text)
    {
        setText(text);
    }

    public TString(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TString(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTString(this);
    }
}
