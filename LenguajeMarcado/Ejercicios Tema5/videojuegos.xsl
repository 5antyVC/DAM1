<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">

        <html>
            <head>Videojuegos</head>
            <body>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th>Plataformas</th>
                        <th>Precio</th>
                        <th>Fecha_de_lanzamiento</th>
                    </tr>
                    <xsl:for-each select="videojuegos/videojuego">
                        <tr>
                            <td>
                                <xsl:value-of select="nombre" />
                            </td>
                            <td>
                                <xsl:value-of select="plataforma" />
                            </td>
                            <td>
                                <xsl:value-of select="precio" />
                            </td>
                            <td>
                                <xsl:value-of select="fecha_de_lanzamiento" />
                            </td>
                        </tr>
                    </xsl:for-each>


                </table>
            </body>

        </html>
    </xsl:template>
</xsl:stylesheet>