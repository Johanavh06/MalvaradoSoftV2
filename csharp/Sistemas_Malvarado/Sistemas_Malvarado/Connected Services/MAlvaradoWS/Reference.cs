﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Sistemas_Malvarado.MAlvaradoWS {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", ConfigurationName="MAlvaradoWS.DBControllerWS")]
    public interface DBControllerWS {
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/deleteGRadeRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/deleteGRadeResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sistemas_Malvarado.MAlvaradoWS.deleteGRadeResponse deleteGRade(Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/deleteGRadeRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/deleteGRadeResponse")]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.deleteGRadeResponse> deleteGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/insertGRadeRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/insertGRadeResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sistemas_Malvarado.MAlvaradoWS.insertGRadeResponse insertGRade(Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/insertGRadeRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/insertGRadeResponse")]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.insertGRadeResponse> insertGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/updateGRadeRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/updateGRadeResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sistemas_Malvarado.MAlvaradoWS.updateGRadeResponse updateGRade(Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/updateGRadeRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/updateGRadeResponse")]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.updateGRadeResponse> updateGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/helloRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/helloResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sistemas_Malvarado.MAlvaradoWS.helloResponse hello(Sistemas_Malvarado.MAlvaradoWS.helloRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/helloRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/helloResponse")]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.helloResponse> helloAsync(Sistemas_Malvarado.MAlvaradoWS.helloRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryAllGradesReques" +
            "t", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryAllGradesRespon" +
            "se")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sistemas_Malvarado.MAlvaradoWS.queryAllGradesResponse queryAllGrades(Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryAllGradesReques" +
            "t", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryAllGradesRespon" +
            "se")]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.queryAllGradesResponse> queryAllGradesAsync(Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest request);
        
        // CODEGEN: El parámetro 'return' requiere información adicional de esquema que no se puede capturar con el modo de parámetros. El atributo específico es 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryGradesByCourseI" +
            "dRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryGradesByCourseI" +
            "dResponse")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdResponse queryGradesByCourseId(Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryGradesByCourseI" +
            "dRequest", ReplyAction="http://services.malvaradosoft.inf.pucp.edu.pe/DBControllerWS/queryGradesByCourseI" +
            "dResponse")]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdResponse> queryGradesByCourseIdAsync(Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest request);
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.7.3190.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/")]
    public partial class grade : object, System.ComponentModel.INotifyPropertyChanged {
        
        private course courseField;
        
        private string descriptionField;
        
        private int idGradeField;
        
        private double weightField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public course course {
            get {
                return this.courseField;
            }
            set {
                this.courseField = value;
                this.RaisePropertyChanged("course");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
        public string description {
            get {
                return this.descriptionField;
            }
            set {
                this.descriptionField = value;
                this.RaisePropertyChanged("description");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public int idGrade {
            get {
                return this.idGradeField;
            }
            set {
                this.idGradeField = value;
                this.RaisePropertyChanged("idGrade");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=3)]
        public double weight {
            get {
                return this.weightField;
            }
            set {
                this.weightField = value;
                this.RaisePropertyChanged("weight");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.7.3190.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/")]
    public partial class course : object, System.ComponentModel.INotifyPropertyChanged {
        
        private int idField;
        
        private int levelField;
        
        private string nameField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public int id {
            get {
                return this.idField;
            }
            set {
                this.idField = value;
                this.RaisePropertyChanged("id");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
        public int level {
            get {
                return this.levelField;
            }
            set {
                this.levelField = value;
                this.RaisePropertyChanged("level");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
                this.RaisePropertyChanged("name");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="deleteGRade", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class deleteGRadeRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Sistemas_Malvarado.MAlvaradoWS.grade grade;
        
        public deleteGRadeRequest() {
        }
        
        public deleteGRadeRequest(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            this.grade = grade;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="deleteGRadeResponse", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class deleteGRadeResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int @return;
        
        public deleteGRadeResponse() {
        }
        
        public deleteGRadeResponse(int @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="insertGRade", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class insertGRadeRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Sistemas_Malvarado.MAlvaradoWS.grade grade;
        
        public insertGRadeRequest() {
        }
        
        public insertGRadeRequest(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            this.grade = grade;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="insertGRadeResponse", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class insertGRadeResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int @return;
        
        public insertGRadeResponse() {
        }
        
        public insertGRadeResponse(int @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="updateGRade", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class updateGRadeRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Sistemas_Malvarado.MAlvaradoWS.grade grade;
        
        public updateGRadeRequest() {
        }
        
        public updateGRadeRequest(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            this.grade = grade;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="updateGRadeResponse", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class updateGRadeResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int @return;
        
        public updateGRadeResponse() {
        }
        
        public updateGRadeResponse(int @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="hello", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class helloRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string name;
        
        public helloRequest() {
        }
        
        public helloRequest(string name) {
            this.name = name;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="helloResponse", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class helloResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string @return;
        
        public helloResponse() {
        }
        
        public helloResponse(string @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="queryAllGrades", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class queryAllGradesRequest {
        
        public queryAllGradesRequest() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="queryAllGradesResponse", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class queryAllGradesResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Sistemas_Malvarado.MAlvaradoWS.grade[] @return;
        
        public queryAllGradesResponse() {
        }
        
        public queryAllGradesResponse(Sistemas_Malvarado.MAlvaradoWS.grade[] @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="queryGradesByCourseId", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class queryGradesByCourseIdRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public int arg0;
        
        public queryGradesByCourseIdRequest() {
        }
        
        public queryGradesByCourseIdRequest(int arg0) {
            this.arg0 = arg0;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="queryGradesByCourseIdResponse", WrapperNamespace="http://services.malvaradosoft.inf.pucp.edu.pe/", IsWrapped=true)]
    public partial class queryGradesByCourseIdResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://services.malvaradosoft.inf.pucp.edu.pe/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Sistemas_Malvarado.MAlvaradoWS.grade[] @return;
        
        public queryGradesByCourseIdResponse() {
        }
        
        public queryGradesByCourseIdResponse(Sistemas_Malvarado.MAlvaradoWS.grade[] @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface DBControllerWSChannel : Sistemas_Malvarado.MAlvaradoWS.DBControllerWS, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class DBControllerWSClient : System.ServiceModel.ClientBase<Sistemas_Malvarado.MAlvaradoWS.DBControllerWS>, Sistemas_Malvarado.MAlvaradoWS.DBControllerWS {
        
        public DBControllerWSClient() {
        }
        
        public DBControllerWSClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public DBControllerWSClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public DBControllerWSClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public DBControllerWSClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sistemas_Malvarado.MAlvaradoWS.deleteGRadeResponse Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.deleteGRade(Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest request) {
            return base.Channel.deleteGRade(request);
        }
        
        public int deleteGRade(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest();
            inValue.grade = grade;
            Sistemas_Malvarado.MAlvaradoWS.deleteGRadeResponse retVal = ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).deleteGRade(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.deleteGRadeResponse> Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.deleteGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest request) {
            return base.Channel.deleteGRadeAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.deleteGRadeResponse> deleteGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.deleteGRadeRequest();
            inValue.grade = grade;
            return ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).deleteGRadeAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sistemas_Malvarado.MAlvaradoWS.insertGRadeResponse Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.insertGRade(Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest request) {
            return base.Channel.insertGRade(request);
        }
        
        public int insertGRade(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest();
            inValue.grade = grade;
            Sistemas_Malvarado.MAlvaradoWS.insertGRadeResponse retVal = ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).insertGRade(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.insertGRadeResponse> Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.insertGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest request) {
            return base.Channel.insertGRadeAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.insertGRadeResponse> insertGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.insertGRadeRequest();
            inValue.grade = grade;
            return ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).insertGRadeAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sistemas_Malvarado.MAlvaradoWS.updateGRadeResponse Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.updateGRade(Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest request) {
            return base.Channel.updateGRade(request);
        }
        
        public int updateGRade(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest();
            inValue.grade = grade;
            Sistemas_Malvarado.MAlvaradoWS.updateGRadeResponse retVal = ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).updateGRade(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.updateGRadeResponse> Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.updateGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest request) {
            return base.Channel.updateGRadeAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.updateGRadeResponse> updateGRadeAsync(Sistemas_Malvarado.MAlvaradoWS.grade grade) {
            Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.updateGRadeRequest();
            inValue.grade = grade;
            return ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).updateGRadeAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sistemas_Malvarado.MAlvaradoWS.helloResponse Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.hello(Sistemas_Malvarado.MAlvaradoWS.helloRequest request) {
            return base.Channel.hello(request);
        }
        
        public string hello(string name) {
            Sistemas_Malvarado.MAlvaradoWS.helloRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.helloRequest();
            inValue.name = name;
            Sistemas_Malvarado.MAlvaradoWS.helloResponse retVal = ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).hello(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.helloResponse> Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.helloAsync(Sistemas_Malvarado.MAlvaradoWS.helloRequest request) {
            return base.Channel.helloAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.helloResponse> helloAsync(string name) {
            Sistemas_Malvarado.MAlvaradoWS.helloRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.helloRequest();
            inValue.name = name;
            return ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).helloAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sistemas_Malvarado.MAlvaradoWS.queryAllGradesResponse Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.queryAllGrades(Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest request) {
            return base.Channel.queryAllGrades(request);
        }
        
        public Sistemas_Malvarado.MAlvaradoWS.grade[] queryAllGrades() {
            Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest();
            Sistemas_Malvarado.MAlvaradoWS.queryAllGradesResponse retVal = ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).queryAllGrades(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.queryAllGradesResponse> Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.queryAllGradesAsync(Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest request) {
            return base.Channel.queryAllGradesAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.queryAllGradesResponse> queryAllGradesAsync() {
            Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.queryAllGradesRequest();
            return ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).queryAllGradesAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdResponse Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.queryGradesByCourseId(Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest request) {
            return base.Channel.queryGradesByCourseId(request);
        }
        
        public Sistemas_Malvarado.MAlvaradoWS.grade[] queryGradesByCourseId(int arg0) {
            Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest();
            inValue.arg0 = arg0;
            Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdResponse retVal = ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).queryGradesByCourseId(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdResponse> Sistemas_Malvarado.MAlvaradoWS.DBControllerWS.queryGradesByCourseIdAsync(Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest request) {
            return base.Channel.queryGradesByCourseIdAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdResponse> queryGradesByCourseIdAsync(int arg0) {
            Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest inValue = new Sistemas_Malvarado.MAlvaradoWS.queryGradesByCourseIdRequest();
            inValue.arg0 = arg0;
            return ((Sistemas_Malvarado.MAlvaradoWS.DBControllerWS)(this)).queryGradesByCourseIdAsync(inValue);
        }
    }
}
