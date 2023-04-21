package telnetd.io.toolkit;

import telnetd.io.BasicTerminalIO;
import telnetd.io.terminal.ColorHelper;
import java.io.IOException;

/**
public class Label extends InertComponent {

    private String m_Content;

    /**
    public Label(BasicTerminalIO io, String name, String text) {
        super(io, name);
        setText(text);
    }

    /**
    public Label(BasicTerminalIO io, String name) {
        super(io, name);
        setText(name);
    }

    /**
    public void setText(String text) {
        m_Content = text;
        m_Dim = new Dimension((int) ColorHelper.getVisibleLength(text), 1);
    }

    /**
    public String getText() {
        return m_Content;
    }

    /**
    public void draw() throws IOException {
        if (m_Position == null) {
            m_IO.write(m_Content);
        } else {
            m_IO.storeCursor();
            m_IO.setCursor(m_Position.getRow(), m_Position.getColumn());
            m_IO.write(m_Content);
            m_IO.restoreCursor();
            m_IO.flush();
        }
    }
}