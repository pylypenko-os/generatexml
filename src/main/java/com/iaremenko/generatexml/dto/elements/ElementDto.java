package com.iaremenko.generatexml.dto.elements;

import com.google.gson.annotations.SerializedName;
import com.iaremenko.generatexml.dto.elements.steps.StepDto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "element")
@XmlType(propOrder = {
        "line",
        "name",
        "description",
        "id",
        "type",
        "keyword",
        "steps"
})
public class ElementDto {

    @SerializedName("line")
    private Integer line;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("id")
    private String id;

    @SerializedName("type")
    private String type;

    @SerializedName("keyword")
    private String keyword;

    @XmlElementWrapper(name = "steps")
    @XmlElement(name = "step")
    @SerializedName("steps")
    private List<StepDto> steps = null;

    @XmlElement(name = "line")
    private Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "description")
    private String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "type")
    private String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "keyword")
    private String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private List<StepDto> getSteps() {
        return steps;
    }

    public void setSteps(List<StepDto> steps) {
        this.steps = steps;
    }

    @XmlElement(name = "id")
    private String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
