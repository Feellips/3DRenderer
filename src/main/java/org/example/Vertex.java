package org.example;

public class Vertex {
    private float m_x;
    private float m_y;

    public float GetX() { return m_x; }
    public float GetY() { return m_y; }

    public void SetX(float m_x) { this.m_x = m_x; }
    public void SetY(float m_y) { this.m_y = m_y; }

    public Vertex(float x, float y) {
        m_x = x;
        m_y = y;
    }
}
