<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">

        <html>
            <head>Star Wars Peliculas</head>
            <body>
                <table border="1">
                    <tr>
                        <th>Pelicula</th>
                        <th>Director</th>
                        <th>anio</th>
                        <th>pais</th>
                    </tr>
                    <xsl:for-each select="peliculas/pelicula">
                        <tr>
                            <td>
                                <xsl:value-of select="nombre" />
                            </td>
                            <td>
                                <xsl:value-of select="director" />
                            </td>
                            <td>
                                <xsl:value-of select="anio" />
                            </td>
                            <td>
                                <xsl:value-of select="pais" />
                            </td>
                        </tr>
                    </xsl:for-each>


                </table>
            </body>

        </html>
    </xsl:template>
</xsl:stylesheet>